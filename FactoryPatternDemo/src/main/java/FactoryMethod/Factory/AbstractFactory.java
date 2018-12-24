package FactoryMethod.Factory;

import FactoryMethod.Product.Shape;

public abstract class AbstractFactory {
    public abstract Shape getCircle();

    public abstract Shape getRectangle();

    public abstract Shape getSquare();
}
