package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat")); // remember to replace with new data file
            int mSumm = 0; // main diagonal sum
            int oSumm = 0; // other sum
            int[][] mat = new int[5][5]; // 5 rows, 5 columns
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();
                }
            }

            for (int r = 0; r < mat.length; r++) {
                mSumm += mat[r][r];
            }
            for (int r = 0; r < mat.length; r++) {
                int c = mat.length - r - 1; // may not need -1
                oSumm += mat[r][c];
            }
            for (int[] row : mat) {
                for (int c : row) {
                    System.out.print(c + " ");
                }
                System.out.println();

            }
            System.out.println("Main diagonal sum: " + mSumm + "\nOther diagonal sum: " + oSumm);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
Main diagonal sum: 147
Other diagonal sum: -3
 */