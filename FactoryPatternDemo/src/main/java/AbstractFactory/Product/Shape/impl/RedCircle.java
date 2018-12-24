package AbstractFactory.Product.Shape.impl;


import AbstractFactory.Product.Shape.Circle;

public class RedCircle implements Circle {
    @Override
    public void draw(){
        System.out.println("Red: Circle.....");
    }
}
