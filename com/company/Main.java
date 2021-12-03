package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.text.NumberFormat;

public class Main {
    private static int numOfCart;
    //ArrayList items;
    private Restaurant[] menuItems;

        public static void mainMenu(){
            System.out.println("\nWelcome to Meow Restaurant Delivery Service!\n");

            System.out.println("-----------------------------------------------------------");
            System.out.println("1. Adding the foods / Purchase");
            System.out.println("2. Exit");
            System.out.println("-----------------------------------------------------------");

            //menu.printMenu();
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please select number");
            int num = userInput.nextInt();
            if (num >= 1 || num >= 2) {
                if(num == 1){
                    order();
                }
                else{
                    exit();
                }
            }
            else{
                System.out.println("Incorrect number");
            }
        }

        public static void order(){
            String foodName;
            Double price;
            Double paids;

            Double total = 0.0;
            //Restaurant[] foods = new Restaurant[100];
            ArrayList<Restaurant> foods = new ArrayList<Restaurant>();

            DessertHouse dessertHouseMenu = new DessertHouse();
            DinerHouse dinerMenu = new DinerHouse();
            Menu menu = new Menu(dessertHouseMenu, dinerMenu);
            menu.printMenu();

            ArrayList<Restaurant> cart = new ArrayList<Restaurant>();
            String keepShopping = "y";

            Scanner userInput = new Scanner(System.in);
            do
            {
                System.out.println( "Enter the name of food you want to order: " );
                foodName = userInput.nextLine();

                System.out.println( "Enter the  price: " );
                price = userInput.nextDouble();
                userInput.nextLine();

                cart.add(new Restaurant(foodName,price));

                System.out.println( "Continue shopping (y/n)? " );
                keepShopping = userInput.nextLine();
            }
            while(keepShopping.equalsIgnoreCase( "y" ));

            System.out.println("-----------------------------------------------------------");
            System.out.println("\n\nFinal Shopping Cart totals" );
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
            System.out.println("\n\nPurchase order: ");
            Scanner paid = new Scanner(System.in);
            System.out.println("Input your money: ");
            paids = userInput.nextDouble();

            Double change;
            change = paids - total;
            System.out.println("Total price: $" + total);
            System.out.println("Receive: $" + paids);
            System.out.println("Change: $" + change);

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


