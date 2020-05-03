package com.huaji;

public class BConF implements BFruitAndVegetables {
    @Override
    public Fruit createF() {
        return new Banana();
    }

    @Override
    public Vegetables createV() {
        return null;
    }
}
