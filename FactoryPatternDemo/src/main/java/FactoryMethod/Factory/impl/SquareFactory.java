package FactoryMethod.Factory.impl;

import FactoryMethod.Factory.AbstractFactory;
import FactoryMethod.Product.Shape;
import FactoryMethod.Product.impl.Square;

public class SquareFactory extends AbstractFactory {
    @Override
    public Shape getSquare() {
        return new Square();
    }

    @Override
    public Shape getCircle() {
        return null;
    }

    @Override
    public Shape getRectangle() {
        return null;
    }
}
