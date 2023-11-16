package Q2.Prog402aArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a.dat")); // remember to replace with new data file
            Cl402a[] nou = new Cl402a[100];
            int count = 0;
            double summ = 0;
            double avg = 0;
            System.out.println("ID\tScore\tDiff");
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                summ += score;
                Cl402a coolbeans = new Cl402a(id, score, summ);
                nou[count] = coolbeans;
                count++;
            }
            for (int lcv = 0; lcv < count; lcv++) {

            }
            for (int lcv = 0; lcv < count; lcv++) {
                nou[lcv].calc(summ, count);
                nou[lcv].toFString();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
