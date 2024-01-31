package Q3.Prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.dat")); // remember to replace with new data file

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
