package CodeSpaces.Q1;
import java.util.Scanner;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter the second time: ");
        double num2 = input.nextDouble();
        double diff = Math.abs(num1 - num2);
        int hours = (int)(diff/100);
        int mins = (int)(diff%100);

        System.out.println(hours + " hours " + mins + " minutes");

    }
}

/*
Please enter the first time: 900
Please enter the second time: 1730
8 hours 30 minutes
 */