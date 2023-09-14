package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Kilowatts used: ");
        double watts = input.nextDouble();
        // math section
        double cost = watts * 0.0475;
        double surcharge = cost * .10;
        double cityTax = cost * 0.03;

        double finalCost = cost + surcharge + cityTax;
        double lateCost = finalCost * 1.04;

        System.out.printf("\n\nBase rate at 4.75 cents is: $%.2f", cost);
        System.out.printf("\nSurcharge: $%.2f", surcharge);
        System.out.printf("\nCity tax: $%.2f", cityTax);

        System.out.printf("\n\nPay this amount: $%.2f", finalCost);
        System.out.printf("\nIf payment is late pay: $%.2f", lateCost);


    }
}

/*
Number of Kilowatts used: 993


Base rate at 4.75 cents is: $47.17
Surcharge: $4.72
City tax: $1.42

Pay this amount: $53.30
If payment is late pay: $55.43
 */