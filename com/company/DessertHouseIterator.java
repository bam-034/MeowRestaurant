package com.company;

import java.util.ArrayList;

public class DessertHouseIterator implements Iterator{
    ArrayList items;
    private int position = 0;
    public DessertHouseIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        Object menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
