package CS220.week3;
import java.util.Scanner;
public class week3LAB_PP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ten digit phone number: ");
        String num = input.nextLine();
        String phoneNumber = "(" + num.substring(0, 3) + ")" + num.substring(3, 6) + "-" + num.substring(6);
        System.out.println("Formatted Phone Number: " + phoneNumber);
    }
}
