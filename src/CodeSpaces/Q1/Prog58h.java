package CodeSpaces.Q1;
import java.util.Scanner;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount saved: ");
        double p = input.nextDouble();
        System.out.print("Interest rate: ");
        double r = input.nextDouble();
        System.out.print("Number of times compounded per year: ");
        double n = input.nextDouble();
        System.out.print("Number of days at interest: ");
        double t = input.nextDouble();

        double a = p * (Math.pow((1+((0.01*r)/n)), (n*t/365)));
        double i = a - p;

        System.out.printf("\nTotal interest earned: $%.2f", i);
        System.out.printf("\nTotal amount of savings: $%.2f", a);
    }
}

/*
Amount saved: 5000
Interest rate: 11.5
Number of times compounded per year: 365
Number of days at interest: 900

Total interest earned: $1638.96
Total amount of savings: $6638.96
 */