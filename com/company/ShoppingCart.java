package com.company;

import java.util.*;
import java.util.Iterator;

public abstract class ShoppingCart{
    private ArrayList items;

    public ShoppingCart(String cusId, String orderDate)
    {
        items = new ArrayList();
    }

    public ArrayList getShoppingCart(){
        return items;
    }

    public double getBalance() {
        Iterator i = items.iterator();
        double balance = 0.00;
        while (i.hasNext()) {
            Restaurant p = (Restaurant)i.next();
            balance = balance + p.getPrice();
        }
        return balance;
    }

    public void addItem(Restaurant p)
    {
        items.add(p);

    }

//    public void removeItem(Restaurant p) throws ProductNotFoundException
//    {
//        if (!items.remove(p))
//        {
//            throw new ProductNotFoundException();
//        }
//    }

    public int getItemCount()
    {
        return items.size();
    }

    public void empty()
    {
        items = new ArrayList();
    }

    public boolean isEmpty()
    {
        return (items.size() == 0);
    }
}

