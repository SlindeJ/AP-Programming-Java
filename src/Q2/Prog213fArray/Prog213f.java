package Q2.Prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213f {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat")); // remember to replace with new data file
            Cl213f[] list = new Cl213f[1000];
            int cnt = 0;       // count to keep track of things

            while (input.hasNext()) {
                int kwh = input.nextInt();
                if (kwh != -999) {
                    Cl213f eee = new Cl213f(kwh);
                    list[cnt] = eee;
                    cnt++;
                }
            }
            for (int lcv = 0; lcv < cnt; lcv++)     // loop to call calc on everything
                list[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv++)     // loop to println everything
                System.out.println(list[lcv]); // OR list[lcv].toString()
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
The cost of 1338.0 is $93.66000000000001
The cost of 9631.0 is $521.55
The cost of 13561.0 is $682.44
 */