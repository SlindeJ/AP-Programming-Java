package CodeSpaces.Q1.Prog82aCl;
import java.util.*;

public class Prog82aClass {
    public static void main(String[] args) {
        Scanner nou = new Scanner(System.in);
        System.out.print("Please enter the speed limit: ");
        int spdlim = nou.nextInt();
        System.out.print("Please enter the speed the vehicle was going: ");
        int speeding = nou.nextInt();


        Cl82a helper = new Cl82a(spdlim, speeding); // take in spdlim and speeding
        helper.calc();
        double fine = helper.getFine();

        System.out.printf("Fine----------------------$%.2f", fine);
    }
}
/*
Please enter the speed limit: 70
Please enter the speed the vehicle was going: 95
Fine----------------------$145.00
 */