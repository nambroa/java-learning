package com.javalearning.designpatterns.creational.prototype;

public class Rectangle extends Shape {
    int width;
    int height;

    /**
     * Non-Prototype constructor
     */
    Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Prototype constructor
     */
    Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    /**
     * Prototype method
     *
     * @param shape object to clone. Can only be a Rectangle.
     */
    @Override
    Shape clone(Shape shape) {
        return new Rectangle(this);
    }
}
