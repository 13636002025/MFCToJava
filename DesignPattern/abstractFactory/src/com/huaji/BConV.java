package com.huaji;

public class BConV implements BFruitAndVegetables {
    @Override
    public Fruit createF() {
        return null;
    }

    @Override
    public Vegetables createV() {
        return new tomato();
    }
}
