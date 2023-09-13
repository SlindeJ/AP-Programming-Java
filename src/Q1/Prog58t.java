package Q1;
import java.util.Scanner;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the price of the item: ");
        double price = input.nextDouble();
        System.out.print("The amount of money received: ");
        double money = input.nextDouble();

        double change = money - price;
        int dollars = (int)change;
        double coins = change - dollars;

        double quarters = ((coins - (coins % 0.25)) / .25);
        double coins2 = .25 * quarters;
        double dimes = ((coins - coins2 - ((coins - coins2) % 0.10)) / .10);
        coins2 += dimes * .10;
        double nickels = ((coins - coins2 - ((coins - coins2) % 0.05)) / .05);
        coins2 += nickels * .05;
        double pennies = ((coins - coins2 - ((coins - coins2) % 0.01)) / .01);

        System.out.printf("Change due %.2f\n", change);
        System.out.println("Dollars:  " + dollars);
        System.out.println("Quarters: " + (int)quarters);
        System.out.println("Dimes:    " + (int)dimes);
        System.out.println("Nickels:  " + (int)nickels);
        System.out.println("Pennies:  " + (int)pennies);

    }
}

/*
Please enter the price of the item: 125.32
The amount of money received: 140
Change due 14.68
Dollars:  14
Quarters: 2
Dimes:    1
Nickels:  1
Pennies:  3
 */