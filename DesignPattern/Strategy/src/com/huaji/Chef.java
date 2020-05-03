package com.huaji;

public class Chef {
    private ICutFruit cutFruit;
    public void SetCutMethod(ICutFruit cutFruit){
        this.cutFruit=cutFruit;
    }
    public void CutFruit(String fruitname){
        cutFruit.CutStrategy(fruitname);
    }
}
