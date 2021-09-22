package com.javalearning.designpatterns.prototype;

public class Circle extends Shape {
    int radius;

    /**
     * Non-Prototype constructor
     */
    Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    /**
     * Prototype constructor
     */
    Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    /**
     * Prototype method
     *
     * @param shape object to clone. Can only be a Circle.
     */
    @Override
    Shape clone(Shape shape) {
        return new Circle(this);
    }
}
