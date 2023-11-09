package Q2.Prog402aArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog402a.dat")); // remember to replace with new data file
            //int[] nou = new int[100];
            int count = 0;

            while (input.hasNext()) {
                int idk = input.nextInt();
                //nou[count] = idk;
                // call the class

                count++;
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
