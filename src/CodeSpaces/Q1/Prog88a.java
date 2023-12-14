package CodeSpaces.Q1;
import java.util.Scanner;

public class Prog88a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // enter number 1-13
        // enter number 2-20
        // Math.random() * (max - min) + min;
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 2;
        // Sum, difference, product, average, abs, value of difference, max and min
        int sum = num1 + num2;
        int dif = num1 - num2;
        int absdif = Math.abs(dif);
        int max, min;
        int product = num1 * num2;
        double avg = (double)sum / 2;

        // The code inside 'if' will only run if the condition is true
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else { // otherwise
            max = num2;
            min = num1;

        }

        // Check if 'max' and 'num1' are the same value using ==
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + dif);
        System.out.println("Product = " + product);
        System.out.println("Average = " + avg);
        System.out.println("Absolute Value = " + absdif);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}

/*
Original numbers are 1 and 6
Sum = 7
Difference = -5
Product = 6
Average = 3.5
Absolute Value = 5
Maximum = 6
Minimum = 1
 */