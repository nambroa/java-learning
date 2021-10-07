package com.javalearning.designpatterns.structural.composite;

import java.util.List;

public class Box implements Item {
    List<Item> items;

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (Item i : items) {
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }

    void addItem(Item item) {
        this.items.add(item);
    }

    void removeItem(Item item) {
        this.items.remove(item);
    }
}
