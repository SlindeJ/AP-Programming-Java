package CS220.take_home8;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(7, 9);
        Shape square = new Square(10);
        Shape triangle = new RightTriangle(2, 8);
        Shape circle2 = new Circle(6);
        Shape triangle2 = new RightTriangle(5, 5);
        Shape rectangle2 = new Rectangle(10, 10);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(triangle.toString());
        System.out.println(circle2.toString());
        System.out.println(triangle2.toString());
        System.out.println(rectangle2.toString());

    }
//    public int compareTo(Shape s) {
//
//        return 0;
//    }
}