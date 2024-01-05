package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465b.dat")); // remember to replace with new data file
            int[][] mat = new int[3][4];
            int[][] matF = new int[3][2];   // can make dynamic later...
            int rr = 0;
            System.out.println("Original Matrix:");
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 4; c++) {
                    mat[r][c] = input.nextInt();
                    System.out.print(mat[r][c] + " ");
                    if (mat[r][c] < 100){
                        matF[rr][0] = r+1;
                        matF[rr][1] = c+1;
                        rr++;
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Position of numbers less than 100:");
            System.out.println("Row:  Col:");
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 2; c++) {
                    System.out.print(matF[r][c] + "      ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix:
100 195 182 225
83 125 235 67
129 42 100 750

Position of numbers less than 100:
Row:  Col:
2      1
2      4
3      2
 */