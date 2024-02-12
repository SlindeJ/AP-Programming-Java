package Q3.Prog408a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog408a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg408a.dat")); // remember to replace with new data file
            Cl408a[] list = new Cl408a[21];
            int count = 0;
            while (input.hasNext()) {
                int id = input.nextInt();
                int score = input.nextInt();
                list[count] = new Cl408a(id, score);
                count++;
            }

            list = SortingAlgs.insertionSort(list);
            System.out.println("ID\tScore");
            for (Cl408a item : list) {
                System.out.print(item.getID() + "\t" + item.getScore());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}