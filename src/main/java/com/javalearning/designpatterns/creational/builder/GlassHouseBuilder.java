package com.javalearning.designpatterns.creational.builder;

public class GlassHouseBuilder extends HouseBuilder {
    @Override
    void buildWalls() {
        this.house.setWall(new GlassWall());
    }

    @Override
    void buildFloor() {
        this.house.setFloor(new GlassFloor());

    }
}
