package com.javalearning.designpatterns.abstractfactory.Furniture;

public class ModernTable implements Table{
    @Override
    public void putObject() {
        System.out.println("Putting an object on a Modern Table.");
    }
}
