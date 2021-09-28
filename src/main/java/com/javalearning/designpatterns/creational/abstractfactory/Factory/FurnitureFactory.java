package com.javalearning.designpatterns.creational.abstractfactory.Factory;

import com.javalearning.designpatterns.creational.abstractfactory.Furniture.Chair;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.Sofa;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.Table;

public abstract interface FurnitureFactory {
    public Chair createChair();

    public Sofa createSofa();

    public Table createTable();
}
