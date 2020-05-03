package com.huaji;

public class Adapter extends OldJuicer implements INewJuicer {

    @Override
    public String newPort(MyFruit fruit1, MyFruit fruit2) {
        String str="混合果汁:"+onePort(fruit1);
        str+=onePort(fruit2);
        return str;
    }
}
