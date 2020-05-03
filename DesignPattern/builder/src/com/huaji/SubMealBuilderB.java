package com.huaji;

//套餐B
public class SubMealBuilderB extends MealBuilder {
    public void buildFood(){
        meal.setFood("鸡肉卷");
        System.out.println("做了个鸡肉卷");
    }
    public void buildDrink(){
        meal.setDrink("橙汁");
        System.out.println("做了个橙汁");
    }
}
