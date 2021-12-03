package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.text.NumberFormat;

public class Main {

        public static void mainMenu(){
            System.out.println("\nWelcome to Meow Restaurant Delivery Service!\n");

            System.out.println("-----------------------------------------------------------");
            System.out.println("1. Adding the foods / Purchase");
            System.out.println("2. Exit");
            System.out.println("-----------------------------------------------------------");

            Scanner userInput = new Scanner(System.in);
            System.out.println("Please select number: ");
            int num = userInput.nextInt();
            if (num == 1 || num == 2) {
                if(num == 1){
                    order();
                }
                if(num == 2){
                    exit();
                }
            }
            else{
                System.out.println("Incorrect number!");
                mainMenu();
            }
        }

        public static void order(){
            String foodName;
            double price;
            double paids;

            double total = 0.0;

            DessertHouse dessertHouseMenu = new DessertHouse();
            DinerHouse dinerMenu = new DinerHouse();
            Menu menu = new Menu(dessertHouseMenu, dinerMenu);
            menu.printMenu();

            ArrayList<Restaurant> cart = new ArrayList<Restaurant>();
            String keepShopping = "y";

            Scanner userInput = new Scanner(System.in);
            do
            {
                System.out.println("Enter the name of food you want to order: ");
                foodName = userInput.nextLine();

                System.out.println("Enter the food's price: ");
                price = userInput.nextDouble();
                while(price < 0 ){
                    System.out.println("Please input again: ");
                    price = userInput.nextDouble();
                };
                userInput.nextLine();

                cart.add(new Restaurant(foodName,price));

                System.out.println("Continue select (y/n)? ");
                keepShopping = userInput.nextLine();
            }
            while(keepShopping.equalsIgnoreCase( "y" ));

            System.out.println("-----------------------------------------------------------");
            System.out.println("\nFinal Shopping Cart totals" );
            for(Restaurant food : cart){
                System.out.println(food);
            }

            for(int i = 0; i < cart.size(); i++){
                total = total + cart.get(i).getPrice();
            }
            System.out.println("Total price: $" + total);
            System.out.println("-----------------------------------------------------------");

            NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

            System.out.println("-----------------------------------------------------------");
            System.out.println("\nPurchase order: ");
            Scanner paid = new Scanner(System.in);
            System.out.println("Input your money: ");
            paids = userInput.nextDouble();

            while(paids < 0 || paids < total){
                System.out.println("Please input again: ");
                paids = userInput.nextDouble();
            };

            double change;
            change = paids - total;
            System.out.println("Total price: $" + total);
            System.out.println("Receive: $" + paids);
            System.out.println("Change: $" + change);
            System.out.println("-----------------------------------------------------------");

            mainMenu();
        }

    public static void exit()
    {
        System.out.println("Thank you for using our service");
    }

    public static void main(String[] args) {
        ArrayList items;
        DessertHouse dessertHouseMenu = new DessertHouse();
        DinerHouse dinerMenu = new DinerHouse();
        Menu menu = new Menu(dessertHouseMenu, dinerMenu);
        mainMenu();
    }

}


