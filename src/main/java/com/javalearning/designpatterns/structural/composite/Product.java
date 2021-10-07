package com.javalearning.designpatterns.structural.composite;

public class Product implements Item {
    int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
