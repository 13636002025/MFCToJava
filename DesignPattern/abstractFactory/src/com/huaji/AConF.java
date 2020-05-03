package com.huaji;

public class AConF implements AFruitAndVegetables {
    @Override
    public Fruit createF() {
        return new Apple();
    }

    @Override
    public Vegetables createV() {
        return null;
    }
}
