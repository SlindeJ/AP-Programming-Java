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
                int count = 0;
                for (int[] row : mat) {
                    for (int n : row) {
                        if (n != 0) { count++; }
                    }
                }
                if ((count * 3) > (r * c)) {
                    // original matrix is abundant
                }
                else if ((count * 3) <= (r * c)) {

                    // original matrix is sparse
                    // make rmat (reduced matrix)
                    int[][] rmat = new int[count][3]; 
                    int rrow = 0; // reduced rows
                    for (int row = 0; row < mat.length; row++) {
                        for (int col = 0; col < mat[0].length; col++) {
                        if (mat[row][col] != 0) { rmat[rrow][2] = mat[row][col]; rmat[rrow][0] = row+1; rmat[rrow][1] = col+1; rrow++; } 
                        }
                    }
                } // do also equal here probably
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
