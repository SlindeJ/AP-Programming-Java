package CodeSpaces.Q1.Prog88aCl;
import java.util.Scanner;

public class Prog88aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number between 1 and 13: ");
        int Num1 = input.nextInt();
        System.out.print("Please enter the second number between 2 and 20: ");
        int Num2 = input.nextInt();

        Cl88a helper = new Cl88a(Num1, Num2);
        helper.calc();
        int sum = helper.getsum();
        double diff = helper.getdiff();
        int product = helper.getproduct();
        double avg = helper.getaverage();
        int absval = helper.getabsval();
        int min = helper.getmin();
        int max = helper.getmax();

        System.out.println("Original numbers are " + Num1 + " and " + Num2);
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The difference between the numbers is: " + diff);
        System.out.println("The product of the numbers is: " + product);
        System.out.printf("The average of the two numbers is: %.2f\n", avg);
        System.out.println("The distance between the numbers is: " + absval);
        System.out.println("The minimum: " + min);
        System.out.println("The maximum: " + max);
    }
}
/*
Please enter the first number between 1 and 13: 13
Please enter the second number between 2 and 20: 20
Original numbers are 13 and 20
The sum of the numbers is: 33
The difference between the numbers is: -7.0
The product of the numbers is: 260
The average of the two numbers is: 16.50
The distance between the numbers is: 7
The minimum: 13
The maximum: 20
 */