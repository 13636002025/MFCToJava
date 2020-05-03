package com.huaji;

public class Cake implements IBirthdayCake {
    public Cake(){
        System.out.println("Cake blank was Create...");
    }
    @Override
    public void Show() {
        System.out.println("Cake blank...");
    }
}
