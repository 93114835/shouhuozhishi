package FactoryMethod.Factory.impl;

import FactoryMethod.Factory.AbstractFactory;
import FactoryMethod.Product.Shape;
import FactoryMethod.Product.impl.Circle;

public class CircleFactory extends AbstractFactory {
    @Override
    public Shape getCircle() {
        return new Circle();
    }

    @Override
    public Shape getSquare() {
        return null;
    }


    @Override
    public Shape getRectangle() {
        return null;
    }


}
