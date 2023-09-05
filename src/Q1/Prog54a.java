package Q1;
import java.util.*;
public class Prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // int, double, bool, String
        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = keyboard.nextInt();
        // double miles = keyboard.nextDouble();
        System.out.print("Enter gallons used: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("MGP used by " + model + " is " + mpg + "m/g");
    }
}
/*
Enter the car model: nou
Enter miles driven: 10
Enter gallons used: 3
MGP used by nou is 3.3333333333333335m/g
 */
