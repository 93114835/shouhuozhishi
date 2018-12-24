package FactoryMethod;

import FactoryMethod.Factory.impl.CircleFactory;
import FactoryMethod.Factory.impl.RectangleFactory;
import FactoryMethod.Factory.impl.SquareFactory;
import FactoryMethod.Product.Shape;
import org.junit.Test;


public class FactoryMethodDemo {
    @Test
    public void main() {
        CircleFactory circleFactory = new CircleFactory();
        RectangleFactory rectangleFactory = new RectangleFactory();
        SquareFactory squareFactory = new SquareFactory();
        //获取Circle的对象
        Shape shape1 = circleFactory.getCircle();
        //获取Rectangle的对象
        Shape shape2 = rectangleFactory.getRectangle();
        //获取Square的对象
        Shape shape3 = squareFactory.getSquare();
        //分别调用Circle、Rectangle、Square对象的draw()方法
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
