package com.javalearning.designpatterns.abstractfactory.Factory;

import com.javalearning.designpatterns.abstractfactory.Furniture.Chair;
import com.javalearning.designpatterns.abstractfactory.Furniture.Sofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.Table;

public abstract interface FurnitureFactory {
    public Chair createChair();

    public Sofa createSofa();

    public Table createTable();
}
