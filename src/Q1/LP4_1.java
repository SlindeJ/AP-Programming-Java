package CodeSpaces.Q1;
import java.util.Scanner;

public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of copies to be printed: ");
        double copies = input.nextDouble();
        double price = 0.50;
        if (copies < 100) {
            price = 0.30;
        } else if (100 <= copies && copies < 500) {
            price = 0.28;
        } else if (500 <= copies && copies < 750) {
            price = 0.27;
        } else if (750 <= copies && copies < 1000) {
            price = 0.26;
        } else if (copies > 1000) {
            price = 0.25;
        }
        double total = copies * price;
        System.out.println("The price per copy is: " + price);
        System.out.printf("Total cost is: %.2f\n", total);
    }
}
/*
 * Please enter the number of copies to be printed: 234
    The price per copy is: 0.28
    Total cost is: 65.52
 */