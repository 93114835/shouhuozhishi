package AbstractFactory.Product.Shape.impl;


import AbstractFactory.Product.Shape.Square;

public class RedSquare implements Square {
    @Override
    public void draw(){
        System.out.println("Red:Square...");
    }

}
