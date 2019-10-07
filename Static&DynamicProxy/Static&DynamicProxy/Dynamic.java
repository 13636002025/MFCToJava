
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dynamic {
	public static void main(String args[]) {
		Pig Pig = new Pig();
		Object proxyInstance = ProxyUtil.getProxyInstance(Pig);
		Animals Animals = (Animals) proxyInstance;
		Animals.action();
		Animals.breath();
		
		Dog dog = new Dog();
		proxyInstance = ProxyUtil.getProxyInstance(dog);
		Animals = (Animals) proxyInstance;
		Animals.action();
		Animals.breath();
	}

}


interface Animals {
	
	public void action();
	public void breath();
}

class Pig implements Animals{
	
	public void action() {
		System.out.println("吼吼吼");
	}

	@Override
	public void breath() {
		System.out.println("猪的呼吸");
	}
}

class Dog implements Animals{
	
	public void action() {
		System.out.println("汪汪汪");
	}

	@Override
	public void breath() {
		System.out.println("狗的呼吸");
	}
}

class MyProxy implements InvocationHandler{
	
	Object obj;
	
	public MyProxy() {}
	
	public void setObj(Object obj) {
		this.obj=obj;
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("@代理类开始工作@");
		Object returnVal = method.invoke(obj, args);
		System.out.println("@代理类结束工作@");
		return returnVal;
	}
	
	
}

class ProxyUtil{
	public static Object getProxyInstance(Object obj) {
		MyProxy proxy = new MyProxy();
		proxy.setObj(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), proxy);
	}
}