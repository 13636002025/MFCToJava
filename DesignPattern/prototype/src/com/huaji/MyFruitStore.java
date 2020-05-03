package com.huaji;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruitHashtable
            =new Hashtable<Integer,MyFruit>();
    public static void Add(Integer key,MyFruit myFruit){
        fruitHashtable.put(key,myFruit);
    }
    public static MyFruit Get(Integer key){
        MyFruit fruit=(MyFruit) fruitHashtable.get(key);
        return (MyFruit) fruit.clone();
    }
}
