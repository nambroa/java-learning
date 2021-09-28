package com.javalearning.designpatterns.structural.adapter;

/**
 * The adapter allows SquareShapes to fit into RoundHoles.
 * To achieve this, the SquareShapeAdapter extends RoundShape but has a SquareShape inside, acting as a link between both.
 * The radius of a square equals its (width * 2^2/2).
 */

public class SquareShapeAdapter extends RoundShape {
    SquareShape squareShape;

    public SquareShapeAdapter(SquareShape squareShape) {
        super((int) (squareShape.getWidth() * Math.sqrt(2) / 2));
        this.squareShape = squareShape;
    }
}
