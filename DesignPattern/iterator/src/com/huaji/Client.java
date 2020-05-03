package com.huaji;

public class Client {
    public static void main(Television television) {
        TVIterator tvIterator=television.createrIterator();
        System.out.println("电视机频道：");
        while (!tvIterator.isLast()){
            System.out.println(tvIterator.currentChannel());
            tvIterator.next();
        }
    }
}
