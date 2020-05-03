package com.huaji;

public class Client {
    public static void main(String[] args) {
        IBirthdayCake birthdayCake=new Cake();
        birthdayCake.Show();
        Cream cream=new Cream(birthdayCake);
        cream.putCream();
        cream.Show();
        Fruit fruit=new Fruit(cream);
        fruit.putFruit();
        fruit.Show();
    }
}
