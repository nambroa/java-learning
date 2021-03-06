package com.javalearning.designpatterns.creational.factory.Scenario;

import com.javalearning.designpatterns.creational.factory.Character.Character;

import java.util.List;

public abstract class Scenario {
    List<Character> characters;

    public Scenario() {
        this.characters = createCharacters();
    }

    abstract List<Character> createCharacters();

    abstract String name();

    void start(){
        System.out.printf(this.name() + " Scenario starting..%n");
    };
}
