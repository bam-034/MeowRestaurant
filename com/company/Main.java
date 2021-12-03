package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DessertHouse dessertHouseMenu = new DessertHouse();
        DinerHouse dinerMenu = new DinerHouse();
        Menu menu = new Menu(dessertHouseMenu, dinerMenu);
        System.out.println("Welcome to Meow Restaurant Delivery Service!");

        System.out.println("-----------------------------------------------------------");
        System.out.println("1. Adding an foods into shopping cart");
        System.out.println("2. Viewing a shopping cart");
        System.out.println("3. Deleting an foods in a shopping cart ");
        System.out.println("4. Deleting a shopping cart");
        System.out.println("5. Purchasing a shopping cart");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------------------------------");

        menu.printMenu();
    }
}
