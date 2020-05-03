package com.huaji;

//指挥者
public class KFCWaiter {
    MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){//实际上送饭的服务员
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}
