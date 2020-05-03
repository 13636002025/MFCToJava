package com.huaji;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
    private ArrayList list=new ArrayList();
    public void accept(AVisitor visitor){
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            ((IProduct)iterator.next()).accept(visitor);
        }
    }
    public void addProduct(IProduct product){
        list.add(product);
    }
    public void removeProduct(IProduct product){
        list.remove(product);
    }
}
