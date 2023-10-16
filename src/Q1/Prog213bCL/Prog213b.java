package Q1.Prog213bCL;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/Prog213b.txt")); // remember to replace with new data file
            int qnt = 0;

            while (input.hasNext()) {
                qnt = input.nextInt();
                Cl213b wowsa = new Cl213b(qnt);
                wowsa.calc();
                System.out.println(wowsa);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Price = $5.95	Amount Due = $89.25
Price = $5.95	Amount Due = $267.75
Price = $5.95	Amount Due = $327.25
Price = $5.95	Amount Due = $333.20
Price = $5.95	Amount Due = $249.90
Price = $5.95	Amount Due = $684.25
Price = $5.95	Amount Due = $547.40
Price = $5.95	Amount Due = $184.45
Price = $5.95	Amount Due = $446.25
Price = $5.95	Amount Due = $285.60
Price = $5.95	Amount Due = $345.10
Price = $5.95	Amount Due = $5.95
Price = $5.95	Amount Due = $148.75
Price = $5.95	Amount Due = $95.20
Price = $5.95	Amount Due = $113.05
 */