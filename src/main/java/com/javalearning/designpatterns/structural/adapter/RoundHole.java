package com.javalearning.designpatterns.structural.adapter;

public class RoundHole {
    int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean fits(RoundShape roundShape) {
        return this.radius >= roundShape.getRadius();
    }
}
