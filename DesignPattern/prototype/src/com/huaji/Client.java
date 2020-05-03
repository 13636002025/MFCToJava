package com.huaji;

public class Client {
    public static void main(String[] args) {
        /*MyFruit fruit=new Apple();
        MyFruit fruit1=(Apple)fruit.clone();
        fruit.Display();
        fruit1.Display();
        System.out.println("fruit:"+fruit.hashCode());
        System.out.println("fruit1:"+fruit1.hashCode());
        System.out.println("fruit:"+fruit.toString());
        System.out.println("fruit1:"+fruit1.toString());
        System.out.println(fruit==fruit1);*/
        MyFruit fruit=new Apple();
        MyFruit fruit1=new Banana();
        MyFruitStore.Add(1,fruit);
        MyFruitStore.Add(2,fruit1);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());

        MyFruit fruit2=(MyFruit)MyFruitStore.Get(4);
        fruit2.Display();
    }
}
