package AbstractFactory.Factory.impl;

import AbstractFactory.Factory.ShapeFactory;
import AbstractFactory.Product.Shape.Circle;
import AbstractFactory.Product.Shape.Square;
import AbstractFactory.Product.Shape.impl.BlueCircel;
import AbstractFactory.Product.Shape.impl.BlueSquare;


public class BlueFactory implements ShapeFactory {
    @Override
    public Circle getCircle(){
        return new BlueCircel();
    }
    @Override
    public Square getSquare(){
        return new BlueSquare();
    }
}
