package com.huaji;

public class Fruit extends Decorating{
    public void putFruit(){
        System.out.println("Add Fruit...");
    }
    public Fruit(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }
}
