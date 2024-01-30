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
                //
                System.out.println("Original Matrix");
                for (int[] row : mat) {
                    for (int n : row) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                }
                //
                if ((count * 3) > (r * c)) {
                    System.out.println("The Original Matrix is Abundant\n");
                }
                else if ((count * 3) <= (r * c)) {

                    // original matrix is sparse
                    int[][] rmat = new int[count][3]; // reduced matrix
                    int rrow = 0; // reduced rows
                    for (int row = 0; row < mat.length; row++) {
                        for (int col = 0; col < mat[0].length; col++) {
                        if (mat[row][col] != 0) { rmat[rrow][2] = mat[row][col]; rmat[rrow][0] = row+1; rmat[rrow][1] = col+1; rrow++; } 
                        }
                    }
                    //
                    for (int[] row : rmat) {
                        for (int n : row) {
                            System.out.print(n + " ");
                        }
                        System.out.println();
                    }
                    if ((count * 3) == (r * c)) {   //
                        System.out.println("The Original Matrix and the Sparse Matrix\n" +
                                "are Equally Efficient");
                    } else {
                        System.out.println("The Original Matrix is Sparse\n");
                    }
                    // rmat made
                } // do also equal here probably
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix
0 0 7 0 0 0
0 0 0 0 -8 0
0 0 0 0 0 0
2 0 0 0 0 0
0 0 0 0 0 0
1 3 7
2 5 -8
4 1 2
The Original Matrix is Sparse

Original Matrix
0 2 0 3 0 1
8 0 4 0 1 0
0 3 0 1 0 -7
5 0 9 0 6 0
0 2 0 -1 0 7
The Original Matrix is Abundant

Original Matrix
0 0 1 0 0 2
3 0 0 4 0 0
0 0 5 0 0 6
7 0 0 8 0 0
0 0 9 0 0 1
1 3 1
1 6 2
2 1 3
2 4 4
3 3 5
3 6 6
4 1 7
4 4 8
5 3 9
5 6 1
The Original Matrix and the Sparse Matrix
are Equally Efficient
 */