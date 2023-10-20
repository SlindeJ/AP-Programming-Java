package Q1.Prog209aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209aCl {
    public static void main(String[] args) {
    try {
        Scanner input = new Scanner(new File("Langdat/prog215a.dat")); // remember to replace with new data file
        int num = 0;
        while (input.hasNext()) {
            num = input.nextInt();
            Cl209a helper = new Cl209a(num);
            //helper.calc();

        }
        // test to find out where file needs to be imported
        Cl209a helper = new Cl209a(0);
        int great = helper.getG500();
        int less = helper.getL500();
        int summ = helper.getTotal();
        System.out.println(summ);
    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }
}
}
