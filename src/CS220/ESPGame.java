package CS220;

import java.util.Scanner;
import javax.swing.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        // colors are red, green, blue, yellow, purple
        int[] colors = new int[5];
        int[] randColors = new int[5];
        String output = "";
        while (true) {
            String input = (String) JOptionPane.showInputDialog(null, "Enter a color: r(red), g(green),b(blue), y(yellow), p(purple):\nEnter q to quit", "ESP game", JOptionPane.QUESTION_MESSAGE); // Initial choice is "Red" here
            if (input == null || Character.toLowerCase(input.trim().charAt(0)) == 'q') //cancel button is clicked or 'q' is entered
                break;
            switch (input.toLowerCase()) {
                case "r": colors[0]++;
                break;
                case "g": colors[1]++;
                break;
                case "b": colors[2]++;
                break;
                case "y": colors[3]++;
                break;
                case "p": colors[4]++;
                break;
                default: break;
            }
            System.out.println(input);
            randColors[returnRand()]++;
        }
        printGuesses(colors);
        printGuesses(randColors);
    }

    public static int returnRand() {    // returns int between 0 - 4
        return (int) (Math.random() * 5);
    }

    public static void printGuesses(int[] g) {
        // print array guesses
        String[] colors = {"red", "green", "blue", "yellow", "purple"};
        for (int i = 0; i < g.length; i++) {
            System.out.print(colors[i] + " ");
            System.out.println(g[i]);
        }
    }
}

