package com.javalearning.designpatterns.prototype;

public abstract class Shape {
    int x;
    int y;
    String color;

    Shape() {
    }


    /**
     * Non-Prototype Constructor.
     */
    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Prototype constructor. Will be called by Rectangle and Circle in their own cloning process.
     *
     * @param shape object to clone.
     */
    Shape(Shape shape) {
        this(shape.x, shape.y, shape.color);
    }

    /**
     * Prototype method
     *
     * @param shape object to clone.
     */
    abstract Shape clone(Shape shape);
}
