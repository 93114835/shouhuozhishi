package AbstractFactory.Product.Shape.impl;

import AbstractFactory.Product.Shape.Square;

public class BlueSquare implements Square {
    @Override
    public void draw(){
        System.out.println("Blue:Square...");
    }
}
