package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat")); // remember to replace with new data file

            while (input.hasNext()) {
                int r = input.nextInt();
                int c = input.nextInt();
                int[][] mat = new int[r][c];
                for (int row = 0; row < mat.length; row++) {
                    for (int col = 0; col < mat[0].length; col++) {
                        mat[row][col] = input.nextInt(); }
                }
                // maybe enhanced for loop?
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
