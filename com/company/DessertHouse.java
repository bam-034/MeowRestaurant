package com.company;

import java.util.ArrayList;

public class DessertHouse extends Food{
    ArrayList menuItems;

    public DessertHouse(){
        menuItems = new ArrayList();
        addItem("1. K&B’s Pancake Breakfast", 2.99);
        addItem("2. Regular Pancake Breakfast", 2.99);
        addItem("3. Blueberry Pancakes", 3.49);
        addItem("4. Waffles", 3.59);
    }

    public void addItem(String name, double price){
        Restaurant menuItem = new Restaurant(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new DessertHouseIterator(menuItems);
    }
}
