package com.huaji;

public class Saler extends AVisitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("收银员"+name+"给顾客称苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员"+name+"直接给顾客书");
    }
}
