package Q2.Prog215hAList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215h.dat")); // remember to replace with new data file
            ArrayList<AList215h> list = new ArrayList<>();

            while (input.hasNext()) {
                double oneScore = input.nextDouble();
                double twoScore = input.nextDouble();
                double threeScore = input.nextDouble();
                double fourScore = input.nextDouble();
                double fiveScore = input.nextDouble();
                double sixScore = input.nextDouble();
                double sevenScore = input.nextDouble();
                double eightScore = input.nextDouble();
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
