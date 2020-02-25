package com.huaji;

public class Client {
    public static void main(String[] args) {
        Charactor charactor=Factory.createCharactor();
        charactor.operation();
    }
}
