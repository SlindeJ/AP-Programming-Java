package Q1;

import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Please enter the second number: ");
        int second = input.nextInt();
        System.out.println("Please enter the third number: ");
        int third = input.nextInt();
        System.out.println("Please enter the fourth number: ");
        int fourth = input.nextInt();
        int sum = first + second + third + fourth;
        double average = (double)sum / 4;
        System.out.println("The sum of the 4 numbers is: " + sum);
        System.out.println("The average of the 4 numbers is: " + average);
    }
}

/*
Please enter the first number:
475
Please enter the second number:
821
Please enter the third number:
369
Please enter the fourth number:
562
The sum of the 4 numbers is: 2227
The average of the 4 numbers is: 556.75
 */