package Q1;
import java.util.*;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter package weight in kilograms: ");
        int kg = input.nextInt();
        System.out.print("Enter package length in centimeters: ");
        int len = input.nextInt();
        System.out.print("Enter package width in centimeters: ");
        int wid = input.nextInt();
        System.out.print("Enter package height in centimeters: ");
        int height = input.nextInt();
        int size = len * wid * height; 
        if (kg > 27) {
            System.out.println("Too heavy ");
        } if (size > 100000) {
            System.out.println("Too big");
        } if (kg <= 27 && size <= 100000) {
            System.out.println("Package is acceptable");
        }
    }
}
/*
 * Enter package weight in kilograms: 1
Enter package length in centimeters: 1
Enter package width in centimeters: 1
Enter package height in centimeters: 1
Package is acceptable
 */
