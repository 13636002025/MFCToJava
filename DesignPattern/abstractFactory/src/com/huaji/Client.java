package com.huaji;

public class Client {
    public static void main(String[] args) {
        AFruitAndVegetables aFruit=new AConF();//创建水果工厂
        Fruit fruit=aFruit.createF();//创建一个苹果的对象
        fruit.eat();//吃苹果
        AFruitAndVegetables aVegetables=new AConV();
        Vegetables vegetables=aVegetables.createV();
        vegetables.eat();
        BFruitAndVegetables bFruit=new BConF();
        Fruit fruit1=bFruit.createF();
        fruit1.eat();
        BFruitAndVegetables bVegetables=new BConV();
        Vegetables vegetables1=bVegetables.createV();
        vegetables1.eat();
    }
}
