package FactoryMethod.Product.impl;

import FactoryMethod.Product.Shape;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Inside RedCircle::draw() method.");
    }
}
