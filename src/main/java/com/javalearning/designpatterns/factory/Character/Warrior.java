package com.javalearning.designpatterns.factory.Character;

public class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("The warrior attacks with his sword!");
    }

    @Override
    public void defend() {
        System.out.println("The warrior defends with his shield!");

    }

    @Override
    public void walk() {
        System.out.println("The warrior walks around..");

    }
}
