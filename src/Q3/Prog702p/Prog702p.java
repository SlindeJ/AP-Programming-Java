package Q3.Prog702p;

import Q3.Prog701g.Admin;
import Q3.Prog701g.Person;
import Q3.Prog701g.Student;
import Q3.Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat")); // remember to replace with new data file
            List<Animal> list = new ArrayList<Animal>();    // list of the parent class

            int num = input.nextInt();
            while (num != 99) {
                String name = input.next();
                String word = input.next();

                if (num == 1) {
                    double fur = input.nextDouble();
                    Animal p = new hiccas(name, word, fur);
                    list.add(p);
                }
                else if (num == 2) {
                    int steps = input.nextInt();
                    Animal p = new wallies(name, word, steps);
                    list.add(p);
                }
                else if (num == 3) {
                    String xWord = input.next();
                    Animal p = new beepers(name, word, xWord);
                    list.add(p);
                }
                num = input.nextInt();
            }
            // vars here
            int numHic = 0;
            int numWal = 0;
            int numBeep = 0; // cus special
            double avgFur = 0;
            int totSteps = 0;
            String allExtras = "";

            for (Animal x : list) {
                if (x instanceof hiccas) {
                    avgFur += ((hiccas)x).getFur();
                    numHic++;
                }
                if (x instanceof wallies) {
                    totSteps += ((wallies)x).getSteps();
                    numWal++;
                }
                if (x instanceof beepers) {
                    allExtras += ((beepers)x).getxWord();
                    numBeep++;
                }
            }
            // other easy vars after this
            double avgWord = (allExtras.length() / (double)numBeep);
            String eachIndiv = allExtras;
            for (int lcv = 0; lcv < eachIndiv.length(); lcv++) {
                char cur = eachIndiv.charAt(lcv);
                while (eachIndiv.indexOf(cur) != eachIndiv.lastIndexOf(cur)) {
                    eachIndiv = eachIndiv.substring(0, eachIndiv.lastIndexOf(cur)) + eachIndiv.substring(eachIndiv.lastIndexOf(cur) + 1);
                }
            }
            int maxAppears = 0;
            int curAppears = 0;
            char mostCommon = ' ';
            for (int lcv = 0; lcv < eachIndiv.length(); lcv++) {
                char cur = eachIndiv.charAt(lcv);
                while (eachIndiv.indexOf(cur) != eachIndiv.lastIndexOf(cur)) {
                    eachIndiv = eachIndiv.substring(0, eachIndiv.lastIndexOf(cur)) + eachIndiv.substring(eachIndiv.lastIndexOf(cur) + 1);
                }
            }
            for (int lcv = 0; lcv < eachIndiv.length(); lcv++) {
                char cur = eachIndiv.charAt(lcv);
                for (int lcv2 = 0; lcv2 < allExtras.length(); lcv2++) {
                    if (cur == allExtras.charAt(lcv2)) {
                        curAppears++;
                        if (curAppears > maxAppears) { maxAppears = curAppears; mostCommon = cur; }
                    }
                }
                curAppears = 0;
            }
            System.out.println("The average value of the Hicca fur is: " + avgFur);
            System.out.println("The average number of steps taken by the Wallies is: " + totSteps);
            System.out.println("The average size of the Beepers words is: " + avgWord);
            System.out.println("The most common letter in all beeper words is: " + mostCommon);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The average value of the Hicca fur is: 18.35
The average number of steps taken by the Wallies is: 316
The average size of the Beepers words is: 7.25
The most common letter in all beeper words is: e
 */