package com.javalearning.designpatterns.factory.Scenario;

import com.javalearning.designpatterns.factory.Character.Character;
import com.javalearning.designpatterns.factory.Character.Warrior;

import java.util.ArrayList;
import java.util.List;

public class City extends Scenario {

    @Override
    public List<Character> createCharacters() {
        List<Character> characters = new ArrayList<>();
        characters.add(new Warrior());
        characters.add(new Warrior());
        characters.add(new Warrior());
        return characters;
    }

    @Override
    String name() {
        return "City";
    }


}
