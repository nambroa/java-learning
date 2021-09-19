package com.javalearning.designpatterns.abstractfactory.Furniture;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair.");
    }
}
