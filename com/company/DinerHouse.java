package com.company;

public class DinerHouse extends Food {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private Restaurant[] menuItems;

    public DinerHouse() {
        menuItems = new Restaurant[MAX_ITEMS];
        addItem("5. Vegetarian BLT",  2.99);
        addItem("6. BLT",  2.99);
        addItem("7. Soup of the day",  3.29);
        addItem("8. Hotdog",  3.05);
    }

    @Override
    public void addItem(String name, double price) {
        Restaurant menuItem = new Restaurant(name, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can’t add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerHouseIterator(menuItems);
    }
}
