package Q1.Prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat")); // remember to replace with new data file
            int age;
            Cl213e ee = new Cl213e();
            while (input.hasNext()) {
                age = input.nextInt();
                ee.calc(age);
            }
            System.out.println("Age group\tDistribution\tPercentage");
            System.out.printf("<20\t\t\t%d\t\t\t\t%.2f\n", ee.getXS(), ((double)ee.getXS() / ee.getSums() * 100.0));
            System.out.printf("20-39\t\t%d\t\t\t\t%.2f\n", ee.getS(), ((double)ee.getS() / ee.getSums() * 100.0));
            System.out.printf("40-59\t\t%d\t\t\t\t%.2f\n", ee.getM(), ((double)ee.getM() / ee.getSums() * 100.0));
            System.out.printf("60-79\t\t%d\t\t\t\t%.2f\n", ee.getL(), ((double)ee.getL() / ee.getSums() * 100.0));
            System.out.printf("80+\t\t\t%d\t\t\t\t%.2f\n", ee.getXL(), ((double)ee.getXL() / ee.getSums() * 100.0));
            System.out.println();
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Age group	Distribution	Percentage
<20			5				21.74
20-39		5				21.74
40-59		8				34.78
60-79		3				13.04
80+			2				8.70
 */