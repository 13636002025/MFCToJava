package com.huaji;

public class BigFruitSorting extends AbstactFruitSort {
    public BigFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("超市:"+fruit);
    }
}
