package com.company;

import java.util.ArrayList;

public class DessertHouse extends Food{
    ArrayList menuItems;

    public DessertHouse(){
        menuItems = new ArrayList();
        addItem("K&B’s Pancake Breakfast", 2.99);
        addItem("Regular Pancake Breakfast", 2.99);
        addItem("Blueberry Pancakes", 3.49);
        addItem("Waffles", 3.59);
    }

    public void addItem(String name, double price){
        Restaurant menuItem = new Restaurant(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new DessertHouseIterator(menuItems);
    }
}
