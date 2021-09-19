package com.javalearning.designpatterns.abstractfactory.Factory;

import com.javalearning.designpatterns.abstractfactory.Furniture.Chair;
import com.javalearning.designpatterns.abstractfactory.Furniture.Sofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.Table;
import com.javalearning.designpatterns.abstractfactory.Furniture.VictorianChair;
import com.javalearning.designpatterns.abstractfactory.Furniture.VictorianSofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.VictorianTable;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
