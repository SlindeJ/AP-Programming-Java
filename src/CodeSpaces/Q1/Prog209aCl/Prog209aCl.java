package CodeSpaces.Q1.Prog209aCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209aCl {
    public static void main(String[] args) {
    try {
        Scanner input = new Scanner(new File("Langdat/prog215a.dat")); // remember to replace with new data file
        int num = 0;
        Cl209a helper = new Cl209a();
        while (input.hasNext()) {
            num = input.nextInt();
<<<<<<< HEAD:src/Q1/Prog209aCl/Prog209aCl.java
            helper.calc(num);
//            great += helper.getG500(num);
//            less += helper.getL500(num);
=======
            //helper.calc();
            great += helper.getG500();
            less += helper.getL500();
>>>>>>> 5ecfa7e (codespace update):src/CodeSpaces/Q1/Prog209aCl/Prog209aCl.java
        }

        System.out.println("The number of numbers less than 500 are: " + helper.getL500());
        System.out.println("The number of numbers greater than 500 are: " + helper.getG500());
        System.out.println("The total amount of numbers is: " + helper.getTotal());
    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }
    }
}
/*
The number of numbers less than 500 are: 192
The number of numbers greater than 500 are: 208
The total amount of numbers is: 400
 */