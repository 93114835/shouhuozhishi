package AbstractFactory.Factory;


import AbstractFactory.Product.Shape.Circle;
import AbstractFactory.Product.Shape.Square;


public interface ShapeFactory {
    public Circle getCircle();
    public Square getSquare();
}
