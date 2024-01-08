package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat")); // remember to replace with new data file
            int[][] mat = new int[6][6]; // 6 rows, 6 columns

            for (int row = 0; row < mat.length-1; row++) {
                for (int col = 0; col < mat[0].length-1; col++) {
                    mat[row][col] = input.nextInt();
                }
            }

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[0].length-1; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

            for (int row = 0; row < mat.length-1; row++) {
                for (int col = 0; col < mat[0].length-1; col++) {
                    mat[row][5] += mat[row][col]; // Sum of the row
                    mat[5][col] += mat[row][col]; // Sum of the column
                    mat[5][5] += mat[row][col]; // Sum of the diagonal
                }
            }
            System.out.println();
            for (int[] row : mat) {
                for (int n : row) {
                    System.out.print(n + " ");
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

45 67 89 12 -3 210
-3 -6 -7 -4 -9 -29
96 81 -8 52 12 233
14 -7 72 29 -1 107
19 43 28 63 87 240
171 178 174 152 86 761
 */