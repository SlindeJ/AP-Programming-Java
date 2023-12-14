package Q2.Prog215iAList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215i.dat")); // remember to replace with new data file
            ArrayList<AList215i> list = new ArrayList<>();

            while (input.hasNext()) {
                int vnum = input.nextInt();
                if (vnum == 0) { break; }
                double gallons = input.nextDouble();
                double miles = input.nextDouble();
                if (gallons == 0 && miles == 0) { continue; }
                AList215i helper = new AList215i(vnum, gallons, miles);


            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
