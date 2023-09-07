package Q1;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        System.out.println("Please enter the radius");
        double rad = input.nextDouble();
        double rad2 = Math.pow(rad, 2);
        double area = PI * rad2;
        double circ = 2 * PI * rad;
        System.out.printf("The area is: %.3f", area);
        System.out.printf("\nThe circumference is: %.3f\n", circ);
    }
}
/*
Please enter the radius
3.712
The area is: 43.288
The circumference is: 23.323
 */