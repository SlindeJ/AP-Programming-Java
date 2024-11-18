package Q1.Prog54cCl;
import java.util.*;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        double rad = input.nextDouble();

        Cl54c helper = new Cl54c(rad);
        helper.calc();

        System.out.printf("The area of the circle is %.2f and the circumference is %.2f\n", helper.getArea(), helper.getCirc());

    }
}
/*
Please enter the radius: 3.712
The area of the circle is 43.29 and the circumference is 23.32
 */