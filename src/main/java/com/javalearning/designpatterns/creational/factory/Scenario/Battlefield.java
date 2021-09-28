package com.javalearning.designpatterns.creational.factory.Scenario;

import com.javalearning.designpatterns.creational.factory.Character.Character;
import com.javalearning.designpatterns.creational.factory.Character.Dragon;
import com.javalearning.designpatterns.creational.factory.Character.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Battlefield extends Scenario {

    @Override
    public List<Character> createCharacters() {
        List<Character> characters = new ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Dragon());
        characters.add(new Warrior());
        return characters;
    }

    @Override
    String name() {
        return "Battlefield";
    }


}