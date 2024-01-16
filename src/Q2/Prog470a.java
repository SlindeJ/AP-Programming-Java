package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat")); // remember to replace with new data file
            int summ = 0;
            int[][] mat = new int[6][5]; // 5 rows, 6 columns
            for (int row = 0; row < mat.length - 1; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();
                }
            }

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[0].length; c++) {
//                    System.out.print(mat[c][r]);
                    //System.out.print(mat[5][r]);
                    mat[5][r] += mat[c][r];
                }
            }
            for (int[] row : mat) {
                for (int c : row) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
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
171 178 174 152 86
 */