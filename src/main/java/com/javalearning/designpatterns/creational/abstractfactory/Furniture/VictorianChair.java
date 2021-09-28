package com.javalearning.designpatterns.creational.abstractfactory.Furniture;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair.");
    }
}
