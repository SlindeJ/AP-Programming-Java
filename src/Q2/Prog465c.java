package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465c.txt")); // remember to replace with new data file
            int[][] mat = new int[input.nextInt()][input.nextInt()];
            int summ = 0;
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
//            for (int row = 0; row < mat.length-1; row++) {
//                for (int col = 0; col < mat[0].length-1; col++) {
//                    mat[row][5] += mat[row][col]; // Sum of the row
//                    mat[5][col] += mat[row][col]; // Sum of the column
//                    mat[5][5] += mat[row][col]; // Sum of the diagonal
//                }
//            }
            for (int r = 0; r < mat.length; r++) {
                summ += mat[r][0];
                summ += mat[r][mat.length];
            }
            summ += mat[mat.length-1][mat[0].length-1];
            System.out.println("The sum of the sides is: " + summ);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
100 195 182 225
83 125 235 67
129 42 100 750
The sum of the sides is: 2104
 */