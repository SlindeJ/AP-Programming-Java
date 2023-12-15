package Q2.Prog215hAList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215h.txt")); // remember to replace with new data file
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
                AList215h helper = new AList215h(oneScore, twoScore, threeScore, fourScore, fiveScore, sixScore, sevenScore, eightScore);
                list.add(helper);
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                AList215h helper = list.get(lcv);
                helper.calc();
                helper.getAvgScore();
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
8.40 9.10 8.50 8.40 9.10 8.70 8.80 9.10 = 8.77
7.00 7.00 7.00 7.00 7.00 7.00 7.00 7.00 = 7.00
8.00 7.90 8.00 8.00 8.00 8.00 8.00 8.10 = 8.00
6.10 7.10 8.10 8.10 8.20 8.20 7.20 6.20 = 7.48
7.20 7.70 7.80 8.80 7.50 6.30 9.20 7.30 = 7.72
6.80 6.90 7.30 8.80 6.70 7.70 7.90 6.30 = 7.22
 */