package com.huaji;

public class Client {
    public static void main(String[] args) {
        Chef chef=new Chef();
        ICutFruit cutFruit=new MultiBlade();
        chef.SetCutMethod(cutFruit);
        chef.CutFruit("橙子");
    }
}
