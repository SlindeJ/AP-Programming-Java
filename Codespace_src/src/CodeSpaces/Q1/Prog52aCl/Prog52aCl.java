package CodeSpaces.Q1.Prog52aCl;
import java.util.*;

public class Prog52aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input section
        System.out.print("Enter length: ");
        int len = input.nextInt();
        System.out.print("Enter width: ");
        int wid = input.nextInt();

        // Calculation Section
        Cl52a wow = new Cl52a(len, wid);
        wow.calc();     // call the helper class to do the math for you
        // Don't forget to call calc or setThing!
        int area = wow.getArea();
        int perim = wow.getPerim();

        // Output Section
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perim);
    }
}
