package com.javalearning.designpatterns.builder;

public class WoodHouseBuilder extends HouseBuilder {

    @Override
    public void buildWalls() {
        this.house.setWall(new WoodWall());
    }

    @Override
    public void buildFloor() {
        this.house.setFloor(new WoodFloor());
    }

}
