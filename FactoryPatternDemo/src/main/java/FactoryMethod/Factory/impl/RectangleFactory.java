package FactoryMethod.Factory.impl;

import FactoryMethod.Factory.AbstractFactory;
import FactoryMethod.Product.Shape;
import FactoryMethod.Product.impl.Rectangle;

public class RectangleFactory extends AbstractFactory {
    @Override
    public Shape getRectangle() {
        return new Rectangle();
    }

    @Override
    public Shape getCircle() {
        return null;
    }

    @Override
    public Shape getSquare() {
        return null;
    }
}
