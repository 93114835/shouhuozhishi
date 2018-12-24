package AbstractFactory.Product.Shape.impl;

import AbstractFactory.Product.Shape.Circle;

public class BlueCircel implements Circle {
    @Override
    public void draw(){
        System.out.println("Blue: Circle.....");
    }
}
