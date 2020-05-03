package com.huaji;

public class MiddleFruitSorting extends AbstactFruitSort {

    public MiddleFruitSorting(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String fruit) {
        fruitBox.add("水果罐头:"+fruit);
    }
}
