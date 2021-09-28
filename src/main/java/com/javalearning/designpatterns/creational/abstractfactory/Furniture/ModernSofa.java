package com.javalearning.designpatterns.creational.abstractfactory.Furniture;

public class ModernSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("Laying on a Modern Sofa.");
    }
}
