package com.javalearning.designpatterns.factory.Character;

public class Dragon implements Character {
    @Override
    public void attack() {
        System.out.println("The dragon attacks with its flamebreath!");
    }

    @Override
    public void defend() {
        System.out.println("The dragon defends with its claws!");

    }

    @Override
    public void walk() {
        System.out.println("The dragon walks around..");

    }
}