package Q2.Prog435aArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat")); // remember to replace with new data file

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
