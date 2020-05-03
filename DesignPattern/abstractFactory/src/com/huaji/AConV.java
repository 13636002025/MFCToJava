package com.huaji;

public class AConV implements AFruitAndVegetables {
    @Override
    public Fruit createF() {
        return null;
    }

    @Override
    public Vegetables createV() {
        return new cabbage();
    }
}
