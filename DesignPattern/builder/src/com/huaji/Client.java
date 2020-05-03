package com.huaji;

public class Client {
    public static void main(String[] args) {
        KFCWaiter kfcWaiter=new KFCWaiter();//new一个服务员
        MealBuilder mealBuilder=new SubMealBuilderA();//点一个A套餐
        kfcWaiter.setMealBuilder(mealBuilder);//把A套餐给服务员
        Meal meal=kfcWaiter.construct();//服务员端出A套餐
        System.out.println(meal.toString());

        MealBuilder mealBuilder1=new SubMealBuilderB();
        kfcWaiter.setMealBuilder(mealBuilder1);
        Meal meal1=kfcWaiter.construct();
        System.out.println(meal1.toString());
    }
}
