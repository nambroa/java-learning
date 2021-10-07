package com.javalearning.designpatterns.structural.composite;

public class Client {
    void executeExample(){
        Box box = new Box();
        box.addItem(new Product(60));
        box.addItem(new Product(40));

        Box smallBox = new Box();
        smallBox.addItem(new Product(10));

        box.addItem(smallBox);

        assert (box.getPrice() == 110);
    }
}
