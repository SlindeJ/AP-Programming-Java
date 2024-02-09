package Q3;
import java.util.*;

public class Prog607a {

    // months A-L 
    // date Q-Z
    // year Z-A (Z is 1) + 1970
    public static String deCode(String code) {
        String month = code.substring(0, 1); 
        String day = code.substring(1, 3); 
        String year = code.substring(3);

        // "ABCDEFGHIJKL"
        String[] months = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        String[] dates = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // Z = 1, A = 26
        String[] years = {"Z" ,"Y" ,"X" ,"W" ,"V" ,"U" ,"T" ,"S" ,"R" ,"Q" ,"P" ,"O" ,"N" ,"M" ,"L" ,"K" ,"J" ,"I" ,"H" ,"G" ,"F" ,"E" ,"D" ,"C" ,"B" ,"A"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(months)) { month = toString(i+1); } // fix this
        }
        return month + " " + day + " " + year; 
    }
    public static String enCode(String code) {
        String[] arr = code.split("/", 3);
        String month = arr[0];
        String day = arr[1];
        String year = arr[2];
        return month + " " + day + " " + year;
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
