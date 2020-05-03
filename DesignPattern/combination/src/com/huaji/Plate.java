package com.huaji;

import java.util.ArrayList;

public class Plate extends MyElement {

    private ArrayList list=new ArrayList();

    public void add(MyElement myElement){
        list.add(myElement);
    }

    public void delete(MyElement myElement){
        list.remove(myElement);
    }
    @Override
    public void eat() {
        for (Object object:list){
            ((MyElement)object).eat();
        }
    }
}
