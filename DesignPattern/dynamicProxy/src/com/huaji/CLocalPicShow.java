package com.huaji;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow {
    private Object target;//要代理的类，目标类
    public CLocalPicShow(Object target){
        super();
        this.target=target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("准备载入图片"+args[0].toString());
                        Thread thread=new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    method.invoke(target,args);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                } catch (InvocationTargetException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        thread.start();
                        return null;
                    }
                });
    }
}
