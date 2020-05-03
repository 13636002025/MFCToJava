package com.huaji;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        AbstactFruitSort Bfs,Mfs,Sfs;
        Bfs=new BigFruitSorting(9);
        Mfs=new MiddleFruitSorting(5);
        Sfs=new SmallFruitSorting(2);

        Bfs.setNexSort(Mfs);
        Mfs.setNexSort(Sfs);

        Random rm=new Random();
        for (int i=0;i<1000;i++){
            int weight=rm.nextInt(10);
            Bfs.sendFruit(weight,"橙子 ");
        }
        Bfs.getFruitBox();
        Mfs.getFruitBox();
        Sfs.getFruitBox();
    }
}
