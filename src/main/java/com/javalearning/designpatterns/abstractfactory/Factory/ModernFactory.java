package com.javalearning.designpatterns.abstractfactory.Factory;

import com.javalearning.designpatterns.abstractfactory.Furniture.Chair;
import com.javalearning.designpatterns.abstractfactory.Furniture.ModernChair;
import com.javalearning.designpatterns.abstractfactory.Furniture.ModernSofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.ModernTable;
import com.javalearning.designpatterns.abstractfactory.Furniture.Sofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.Table;

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
