package AbstractFactory;

import AbstractFactory.Factory.ShapeFactory;
import AbstractFactory.Factory.impl.BlueFactory;
import AbstractFactory.Factory.impl.RedFactory;
import AbstractFactory.Product.Shape.Circle;
import AbstractFactory.Product.Shape.Square;
import org.junit.Test;


public class FactoryDemo {
    @Test
    public  void main(){
        //获取blue工厂
        ShapeFactory blueFactory = new BlueFactory();
        //通过blue工厂获取Circle、Square对象
        Circle circle = blueFactory.getCircle();
        Square square = blueFactory.getSquare();
        //调用Circle、Square对象的draw()方法
        circle.draw();
        square.draw();
        System.out.println("-----------------------------");
        //获取red工厂
        ShapeFactory redFactory = new RedFactory();
        //通过red工厂获取Circle、Square对象
        Circle circle1 = redFactory.getCircle();
        Square square1 = redFactory.getSquare();
        //调用Circle、Square对象的draw()方法
        circle1.draw();
        square1.draw();
    }
}
