package com.huaji;

public class Cream extends Decorating {
    public void putCream(){
        System.out.println("Add Cream...");
    }
    public Cream(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }
}
