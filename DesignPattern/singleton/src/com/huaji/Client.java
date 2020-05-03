package com.huaji;

public class Client {
    public static void main(String[] args) {
        MyFruit fruit=new Apple();
        MyFruit fruit1=new Banana();
        MyFruitStore myFruitStore=MyFruitStore.GetFruitStore();
        myFruitStore.Add(1,fruit);
        myFruitStore.Add(2,fruit1);
        myFruitStore.Add(3,new Apple());
        myFruitStore.Add(4,new Banana());

        MyFruitStore myFruitStore1=MyFruitStore.GetFruitStore();
        MyFruit fruit2=(MyFruit)myFruitStore.Get(3);
        fruit2.Display();
        System.out.println("myFruitStore:"+myFruitStore.toString());
        System.out.println("myFruitStore1:"+myFruitStore1.toString());
    }
}
