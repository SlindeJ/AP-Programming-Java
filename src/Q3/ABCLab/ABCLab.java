package Q3.ABCLab;
import java.util.*;
import Q3.AbstClLab.*;

public class ABCLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Circle
        System.out.print("Enter circle radius: " );
        double r = input.nextDouble();
        Shape sh1 = new Circle(r);
        // Rectangle
        System.out.print("Enter height: ");
        double rh = input.nextDouble(); // rectangle height
        System.out.print("Enter width: ");
        double rw = input.nextDouble(); // rectangle width
        Shape sh2 = new Rectangle(rh, rw);
        // Triangle
        System.out.print("Enter triangle base: ");
        double tb = input.nextDouble(); // triangle base
        System.out.print("Enter triangle height: ");
        double th = input.nextDouble(); // triangle height
        Shape sh3 = new Triangle(tb, th);

        sh1.printClass(); // safer to do ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();
        sh2.printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();   //((Rectangle)sh2).calculatePerimeter();
        sh3.printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();   //((Triangle)sh3).calculatePerimeter();
    }
}
/*
Enter circle radius: 3
Enter height: 3
Enter width: 3
Enter triangle base: 3
Enter triangle height: 3
Circle
Area: 28.274333882308138
Circumference 18.84955592153876
Rectangle
Area: 9.0
Perimeter: 12.0
Triangle
Area: 4.5
Perimeter: 10.242640687119284
 */