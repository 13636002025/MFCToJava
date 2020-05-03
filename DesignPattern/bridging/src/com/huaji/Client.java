package com.huaji;

public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;

        color=new Blue();
        pen=new MiddlePen();

        pen.setColor(color);
        pen.draw("鲜花");
    }
}
