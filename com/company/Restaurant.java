package com.company;
import java.text.NumberFormat;

public class Restaurant {
    private String name;
    private double price;

    public Restaurant(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String strTab = name.length() > 8 ? "\t" : "\t\t";
        return name + strTab + fmt.format(price) + "\t\t";
    }
}
