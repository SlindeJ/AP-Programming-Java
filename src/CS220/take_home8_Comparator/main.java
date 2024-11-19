package CS220.take_home8_Comparator;

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
        ArrayList<Shape> sArray = new ArrayList<>();
        sArray.add(circle); sArray.add(rectangle); sArray.add(square); sArray.add(triangle); sArray.add(circle2); sArray.add(triangle2); sArray.add(rectangle2);
        for (Shape s : sArray) {
            System.out.println(s);
        }
        System.out.println("Shapes Sorted by Area:\n");
        Collections.sort(sArray, new SortByArea());
        for (Shape s : sArray) {
            System.out.println(s);
        }
        System.out.println("Top 5 Shapes Sorted by Perimeter:\n");
        Collections.sort(sArray, new SortByPerimeter());
        for (int i = 0; i < 4; i++) {
            System.out.println(sArray.get(i));
        }
    }
}