package com.huaji;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstactFruitSort {
    private int weight;
    protected List<String> fruitBox;
    private AbstactFruitSort nextFruitSort;
    public void getFruitBox(){
        System.out.print("Weight:"+weight);
        System.out.println("个数:"+fruitBox.size());
        for (String t:fruitBox){
            System.out.print(t+",");
        }
        System.out.println(" ");
    }
    public AbstactFruitSort(int weight){
        this.weight=weight;
        fruitBox=new ArrayList<String>();
    }
    public void setNexSort(AbstactFruitSort nextFruitSort){
        this.nextFruitSort=nextFruitSort;
    }
    public void sendFruit(int weight,String fruit){
        if (this.weight<=weight){
            pushBox(fruit);
        }else {
            if (nextFruitSort!=null)
                nextFruitSort.sendFruit(weight,fruit);
        }
    }

    protected abstract void pushBox(String fruit);
}