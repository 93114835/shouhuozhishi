package FactoryMethod.Product.impl;

import FactoryMethod.Product.Shape;

public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside RedSquare::draw() method.");
    }

}
