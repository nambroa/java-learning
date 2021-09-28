package com.javalearning.designpatterns.structural.adapter;

public class Client {

    void execute() {
        SquareShape squareShape1 = new SquareShape(4);
        SquareShapeAdapter squareShapeAdapter1 = new SquareShapeAdapter(squareShape1);
        RoundHole roundHole1 = new RoundHole(15);
        assert roundHole1.fits(squareShapeAdapter1);
    }
}
