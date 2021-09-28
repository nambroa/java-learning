package com.javalearning.designpatterns.creational.abstractfactory.Factory;

import com.javalearning.designpatterns.creational.abstractfactory.Furniture.Chair;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.ModernChair;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.ModernSofa;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.ModernTable;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.Sofa;
import com.javalearning.designpatterns.creational.abstractfactory.Furniture.Table;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
