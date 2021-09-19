package com.javalearning.designpatterns.abstractfactory.Furniture;

public class FuturisticTable implements Table{
    @Override
    public void putObject() {
        System.out.println("Putting an object on a Futuristic Table.");
    }
}
