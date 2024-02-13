package Q3;
import java.util.*;

public class Prog607a {

    // months A-L 
    // date Q-Z
    // year Z-A (Z is 1) + 1970
    public static String deCode(String code) {
        String month = code.substring(0, 1); 
        String day1 = code.substring(1, 2);
        String day2 = code.substring(2, 3);
        String year = code.substring(3);

        // "ABCDEFGHIJKL"
        String[] months = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        String[] dates = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // Z = 1, A = 26
        String[] years = {"Z" ,"Y" ,"X" ,"W" ,"V" ,"U" ,"T" ,"S" ,"R" ,"Q" ,"P" ,"O" ,"N" ,"M" ,"L" ,"K" ,"J" ,"I" ,"H" ,"G" ,"F" ,"E" ,"D" ,"C" ,"B" ,"A"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month)) { month = "" + (i+1); } // bruh
        }
        for (int i = 0; i < dates.length; i++) {
            if (dates[i].equals(day1)) { day1 = "" + (i+1); }
        }
        for (int i = 0; i < dates.length; i++) {
            if (dates[i].equals(day2)) { day2 = "" + (i+1); }
        }
        for (int i = 0; i < years.length; i++) {
            if (years[i].equals(year)) { year = "" + (i+1 + 1970); } // fix this
        }
        return month + " " + day1 + day2 + " " + year;
    }
    public static String enCode(String code) {
        String[] arr = code.split("/", 3);
        String month = arr[0];
        String day1 = arr[1].substring(0, 1);
        String day2 = arr[1].substring(1);
        String year = arr[2];

        String[] months = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        String[] dates = {"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // Z = 1, A = 26
        String[] years = {"Z" ,"Y" ,"X" ,"W" ,"V" ,"U" ,"T" ,"S" ,"R" ,"Q" ,"P" ,"O" ,"N" ,"M" ,"L" ,"K" ,"J" ,"I" ,"H" ,"G" ,"F" ,"E" ,"D" ,"C" ,"B" ,"A"};

        // use .valueOf(String s);
        // do here
        int m = Integer.valueOf(month) - 1;
        int d1 = Integer.valueOf(day1) - 1;
        int d2 = Integer.valueOf(day2) - 1;
        int y = Integer.valueOf(year) - 1971;
        month = months[m];
        day1 = dates[d1];
        day2 = dates[d2];
        year = years[y];
        return month + " " + day1 + day2 + " " + year;
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
/*
0) Quit
1) Encode Date
2) Decode Date

Select an option: 1
Enter a date (m/d/y):
9/14/1983
I QT N

0) Quit
1) Encode Date
2) Decode Date

Select an option: 2
Enter the code:
AOQV
1 O1 1975
 */