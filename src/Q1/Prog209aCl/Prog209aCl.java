package Q1.Prog209aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209aCl {
    public static void main(String[] args) {
    try {
        Scanner input = new Scanner(new File("Langdat/prog215a.dat")); // remember to replace with new data file
        int num = 0;
        int great = 0;
        int less = 0;
        int summ = 0;
        Cl209a helper = new Cl209a();
        while (input.hasNext()) {
            num = input.nextInt();
            //helper.calc();
            great += helper.getG500(num);
            less += helper.getL500(num);
        }

        System.out.println(great);
    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }
}
}
