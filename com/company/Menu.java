package com.company;

public class Menu {
    private DessertHouse dessertHouseMenu;
    private DinerHouse dinerMenu;
    public Menu(DessertHouse pancakeHouseMenu, DinerHouse dinerMenu) {
        this.dessertHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator dessertIterator = dessertHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nDessert");
        printMenu(dessertIterator);
        System.out.println("\nFood");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Restaurant menuItem = (Restaurant)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print("Price: " + menuItem.getPrice() + " -- \n");
        }
    }
}
