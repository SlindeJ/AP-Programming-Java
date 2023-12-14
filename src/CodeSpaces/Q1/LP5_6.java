package CodeSpaces.Q1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        int num2 = 0;
        while (number > 0) {
            num2 += number % 10;
            number = (int)(number / 10);
        }
        System.out.println("The sum of the digits is: " + num2);
    }
    
}
/*
 * Please enter the number: 892
The sum of the digits is: 19
 */