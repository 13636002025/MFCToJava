package com.huaji;

public class MyFruit implements Cloneable {
    protected String kind;
    public void Display(){
        System.out.println(kind);
    }
    public Object clone(){
        Object object=null;
        try {
            object=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
