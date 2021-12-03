package com.company;

import java.util.ArrayList;

public abstract class Food implements FoodInterface{
    private String name;
    private double price;

    @Override
    public abstract void addItem(String name, double price);

}
