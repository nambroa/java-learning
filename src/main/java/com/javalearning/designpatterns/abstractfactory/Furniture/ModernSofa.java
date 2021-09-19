package com.javalearning.designpatterns.abstractfactory.Furniture;

public class ModernSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("Laying on a Modern Sofa.");
    }
}
