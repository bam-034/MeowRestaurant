package com.company;

public class DinerHouseIterator implements Iterator{
    private Restaurant[] items;
    private int position = 0;
    public DinerHouseIterator(Restaurant[] items)
    {
        this.items = items;
    }
    public Object next() {
        Restaurant menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
