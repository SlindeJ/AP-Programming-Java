package Q1;
import java.util.*;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Please enter the length: ");
        int len = input.nextInt();
        System.out.print("Please enter the width: ");
        int wid = input.nextInt();
        System.out.print("Please enter the height: ");
        int height = input.nextInt();
        System.out.println("The volume is: " + (len * wid * height) + "\n");
        System.out.println("Sphere");
        System.out.print("Please enter the radius: ");
        double rad = input.nextDouble();
        double diam = rad * 2;
        double volume = 3.14159 * Math.pow(diam, 3) / 6;
        System.out.printf("The volume is: %.3f\n", volume);
        System.out.println("Cube");
        System.out.print("Please enter the length of each side: ");
        double side = input.nextDouble();
        System.out.println("The volume is: " + Math.pow(side, 3));
    }
    
}
/*
 * Rectangular Prism
Please enter the length: 3
Please enter the width: 4
Please enter the height: 5
The volume is: 60

Sphere
Please enter the radius: 3
The volume is: 113.097
Cube
Please enter the length of each side: 4
The volume is: 64.0
 */