package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a.dat")); // remember to replace with new data file
            int[][] mat = new int[5][3];
//            for (int row = 0; row < mat.length; row++) {
//                for (int col = 0; col < mat[0].length; col++) {
//                    mat[row][col] = input.nextInt(); }
//            }
            // maybe enhanced for loop?
//            int count = 0;
//            for (int[] row : mat) {
//                for (int n : row) {
//                    if (n != 0) { count++; }
//                }
//            }
            int totMale = 0;
            int totFemale = 0;
            while (input.hasNext()) {
                int type = input.nextInt();
                int grade = input.nextInt();
                mat[grade-1][type-1]++;
                mat[grade-1][2]++;
                if (type == 1) { totMale++; }
                if (type == 2) { totFemale++; }
            }
            System.out.println("Grade\tMale\tFemale\tTotal");
            for (int[] row : mat) {
                System.out.print("ABCDF ");
                for (int n : row) {
                    System.out.print(" \t" + n);
                }
                System.out.println();
            }
            System.out.println("Totals:\t" + totMale + "\t" + totFemale + "\t" + (totFemale+totMale));
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Grade	Male	Female	Total
ABCDF  	2 	4 	6
ABCDF  	4 	4 	8
ABCDF  	4 	7 	11
ABCDF  	2 	3 	5
ABCDF  	3 	0 	3
Totals:	15	18	33
 */