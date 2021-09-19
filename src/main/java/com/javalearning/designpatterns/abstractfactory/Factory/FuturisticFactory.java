package com.javalearning.designpatterns.abstractfactory.Factory;

import com.javalearning.designpatterns.abstractfactory.Furniture.Chair;
import com.javalearning.designpatterns.abstractfactory.Furniture.FuturisticChair;
import com.javalearning.designpatterns.abstractfactory.Furniture.FuturisticSofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.FuturisticTable;
import com.javalearning.designpatterns.abstractfactory.Furniture.Sofa;
import com.javalearning.designpatterns.abstractfactory.Furniture.Table;

public class FuturisticFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new FuturisticChair();
    }

    @Override
    public Sofa createSofa() {
        return new FuturisticSofa();
    }

    @Override
    public Table createTable() {
        return new FuturisticTable();
    }
}
