package com.huaji;

public class SmallFruitSorting extends AbstactFruitSort {
    public SmallFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("打果汁:"+fruit);
    }
}
