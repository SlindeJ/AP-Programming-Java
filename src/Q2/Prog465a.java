package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465a.dat")); // remember to replace with new data file
            int[][] mat1 = new int[4][4];
            int[][] mat2 = new int[4][4];
            int[][] matF = new int[4][4]; // final matricies
            System.out.println("Arr1:");
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    mat1[r][c] = input.nextInt();
                    System.out.print(mat1[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Arr2:");
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    mat2[r][c] = input.nextInt();
                    System.out.print(mat2[r][c] + " ");
                }
                System.out.println();
            }

            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    if (mat1[r][c] > mat2[r][c]) {
                        matF[r][c] = mat1[r][c];
                    }
                    else {
                        matF[r][c] = mat2[r][c];
                    }
                }
            }
            System.out.println();
            System.out.println("Final Array:");
            for (int r = 0; r < 4; r++) {
                for (int c = 0; c < 4; c++) {
                    System.out.print(matF[r][c] + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Arr1:
2 7 6 4
6 1 2 4
9 7 2 6
8 3 2 1

Arr2:
4 1 3 7
6 2 3 8
7 2 2 4
4 2 3 1

Final Array:
4 7 6 7
6 2 3 8
9 7 2 6
8 3 3 1
 */