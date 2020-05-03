package com.huaji;

public class Client {
    public static void main(String[] args) {
        MyFruit fruit=new Apple();
        MyFruit fruit1=new Banana();
        MyFruitStore.Add(1,fruit);
        MyFruitStore.Add(2,fruit1);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());

        INewJuicer juicer=new Adapter();
        System.out.println(juicer.newPort(MyFruitStore.Get(3), MyFruitStore.Get(4)));
    }
}
