package Q1.Prog213fCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213f {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat")); // remember to replace with new data file

            while (input.hasNext()) {
                int kwh = input.nextInt();
                if (kwh < 0) {
                    break;
                }
                Cl213f helper = new Cl213f(kwh);
                helper.calc();
                System.out.printf("The cost of %d kwh is $%.2f\n", kwh, helper.getCost());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The cost of 1338 kwh is $93.66
The cost of 9631 kwh is $521.55
The cost of 13561 kwh is $682.44
 */

