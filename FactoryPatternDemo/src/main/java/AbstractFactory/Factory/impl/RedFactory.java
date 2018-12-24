package AbstractFactory.Factory.impl;

import AbstractFactory.Factory.ShapeFactory;
import AbstractFactory.Product.Shape.Circle;
import AbstractFactory.Product.Shape.Square;
import AbstractFactory.Product.Shape.impl.RedCircle;
import AbstractFactory.Product.Shape.impl.RedSquare;

public class RedFactory implements ShapeFactory {
    @Override
    public Circle getCircle(){
        return new RedCircle();
    }
    @Override
    public Square getSquare(){
        return new RedSquare();
    }
}
