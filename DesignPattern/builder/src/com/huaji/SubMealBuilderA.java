package com.huaji;

//套餐A
public class SubMealBuilderA extends MealBuilder {
    public void buildFood(){
        meal.setFood("汉堡");
        System.out.println("做了个汉堡");
    }
    public void buildDrink(){
        meal.setDrink("可乐");
        System.out.println("做了个可乐");
    }
}
