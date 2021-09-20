package com.javalearning.designpatterns.builder;

public abstract class HouseBuilder {
    House house;

    abstract void buildWalls();

    abstract void buildFloor();

    public void buildPool() {
        this.house.setHasPool(true);
    }

    public void buildFlowers() {
        this.house.setHasFlowers(true);
    }

    public void buildTrees() {
        this.house.setHasTrees(true);
    }

    public void reset() {
        this.house = new House();
    }
}
