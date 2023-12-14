package CodeSpaces.Q1;
import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of pounds: ");
        int pound = input.nextInt();
        System.out.print("Please enter the amount of shillings: ");
        int shilling = input.nextInt();
        System.out.print("Please enter the amount of pence: ");
        int pence = input.nextInt();

        double shillconv = (double)shilling / 20;
        double penceconv = (double)pence / 240;
        double newCost = pound + shillconv + penceconv;

        System.out.printf("\nDecimal pounds = %.2f", newCost);
    }
}

/*
Please enter the amount of pounds: 7
Please enter the amount of shillings: 17
Please enter the amount of pence: 9

Decimal pounds = 7.89
 */
