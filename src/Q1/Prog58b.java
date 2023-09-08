package Q1;

import java.util.Scanner;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value A");
        int A = input.nextInt();
        System.out.println("Please enter value B");
        int B = input.nextInt();
        System.out.println("Please enter value C");
        int C = input.nextInt();

        double proot = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
        double nroot = (-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
        System.out.printf("The positive root is: %.2f\n", proot);
        System.out.printf("\nThe negative root is: %.2f\n", nroot);
    }
}
/*
Please enter value A
1
Please enter value B
1
Please enter value C
-2
The positive root is: 1.00

The negative root is: -2.00
 */