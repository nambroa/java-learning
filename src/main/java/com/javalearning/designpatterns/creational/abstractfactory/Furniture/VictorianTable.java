package com.javalearning.designpatterns.creational.abstractfactory.Furniture;

public class VictorianTable implements Table {
    @Override
    public void putObject() {
        System.out.println("Putting an object on a Victorian Table.");
    }
}
