package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465c.txt")); // remember to replace with new data file
            int[][] mat = new int[input.nextInt()][input.nextInt()];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
