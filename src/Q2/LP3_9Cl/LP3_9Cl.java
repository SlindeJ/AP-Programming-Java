package Q2.LP3_9Cl;
import java.util.*;

public class LP3_9Cl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int byear = input.nextInt();
        System.out.print("Month: ");
        int bmonth = input.nextInt();
        System.out.print("Day: ");
        int bday = input.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int tyear = input.nextInt();    // t = today's
        System.out.print("Month: ");
        int tmonth = input.nextInt();
        System.out.print("Day: ");
        int tday = input.nextInt();
        Cl3_9 helper = new Cl3_9(byear, bmonth, bday, tyear, tmonth, tday);
        helper.calc();
        System.out.println(helper.toString());
    }
}
/*
Enter your birthdate:
Year: 1997
Month: 2
Day: 12
Enter today's date:
Year: 2012
Month: 8
Day: 3
You have been alive for 5646 days.
You have slept for 45168 hours.
 */