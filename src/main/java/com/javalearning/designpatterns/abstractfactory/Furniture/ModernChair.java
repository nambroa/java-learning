package com.javalearning.designpatterns.abstractfactory.Furniture;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair.");
    }
}
