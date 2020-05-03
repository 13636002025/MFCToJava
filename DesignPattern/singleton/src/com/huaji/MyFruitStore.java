package com.huaji;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruitHashtable=null;
    private static MyFruitStore myFruitStore=null;
    private MyFruitStore(){//设置为private，就无法直接new，必须要使用GetFruitStore方法来获取对象
        fruitHashtable=new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore GetFruitStore(){
        if (myFruitStore==null){
            return new MyFruitStore();
        }
        return myFruitStore;
    }
    public void Add(Integer key,MyFruit myFruit){
        fruitHashtable.put(key,myFruit);
    }
    public MyFruit Get(Integer key){
        MyFruit fruit=(MyFruit) fruitHashtable.get(key);
        return (MyFruit) fruit.clone();
    }
}
