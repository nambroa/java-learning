package com.javalearning.designpatterns.builder;

class House {
    private boolean hasPool;
    private boolean hasTrees;
    private boolean hasFlowers;
    private Floor floor;
    private Wall wall;

    public boolean isHasPool() {
        return hasPool;
    }

    public boolean isHasTrees() {
        return hasTrees;
    }

    public boolean isHasFlowers() {
        return hasFlowers;
    }

    public Floor getFloor() {
        return floor;
    }

    public Wall getWall() {
        return wall;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setHasTrees(boolean hasTrees) {
        this.hasTrees = hasTrees;
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}
