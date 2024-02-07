package Q3;
import java.util.*;

public class Prog607a {
    public static String deCode(String code) {

        return "";
    }
    public static String enCode(String code) {

        return "";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("0) Quit\n" +
                "1) Encode Date\n" +
                "2) Decode Date\n");
        System.out.print("Select an option: ");
        int option = input.nextInt();

        if (option == 0) {
            System.out.println("Application Closed");
        } else if (option == 1) {
            System.out.println("Enter a date (m/d/y): ");
            String date = input.next();
            System.out.println(enCode(date));
        } else if (option == 2) {
            System.out.println("Enter the code: ");
            String code = input.next();
            System.out.println(deCode(code));
        } else {
            System.out.println("Error, Invalid Choice");
        }
    }
}
