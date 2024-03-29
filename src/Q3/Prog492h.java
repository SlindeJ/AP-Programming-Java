package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Prog492h {
    public static String[][] newGen(String[][] oldGen) {
        String[][] workwith = new String[32][32];
        for (int row = 0; row < oldGen.length; row++) {     // this is putting the oldgen info into the workwith array
            for (int col = 0; col < oldGen[0].length; col++) {
                workwith[row+1][col+1] = oldGen[row][col]; }
        }
        for (int row = 0; row < oldGen.length; row++) {     // this is altering the workwith array data (not the edges though)
            for (int col = 0; col < oldGen[0].length; col++) {
                workwith[row+1][col+1] = "e";
            }
        }
        return workwith;
    }

//    public static String LiveOrDie(tl, tm, tr, ml, mm, mr, bl, bm, br) {    // top left, top middle, top right, middle, and bottom...
//continue here
//
//        return ".";
//    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog492h.dat"));
            String[][] mat = new String[30][30];
            for (int row = 0; row < mat.length; row++) {
                String[] arr = input.next().split("");
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = arr[col]; }
            }
//            String e = ".....";
//            String[] arr = e.split("");
//            for (String a : arr) {
//                System.out.println(" " + a + " ");
//            }
            System.out.println("Generation 0");
            for (String[] row : mat) {
                for (String n : row) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }

            // need to make a number of iterations for every generation
            // thinking about a newGen() helper to return a new String[][] of the next generation
            // might make a String[32][32] with empty edges so I don't have to account for edges

//            for (int i = 1; i <= 30; i++) { // starts with gen 1 and completes gen 30
//                System.out.println("Generation " + i);
                mat = newGen(mat);
//                // print out newgen
//            }
            System.out.println();
            for (String[] row : mat) {
                for (String n : row) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}