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
        int rand;
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
                default: System.exit(0);
            }
            rand = returnRand();
            randColors[rand]++;
            switch (rand) {
                case 0: System.out.println("The computer chose: red"); break;
                case 1: System.out.println("The computer chose: green"); break;
                case 2: System.out.println("The computer chose: blue"); break;
                case 3: System.out.println("The computer chose: yellow"); break;
                case 4: System.out.println("The computer chose: purple"); break;
                default: break;
            }
        }
        System.out.println();
        System.out.println("Your guesses:");
        printGuesses(colors);
        System.out.println("The computer's guesses: ");
        printGuesses(randColors);
        int total = 0;
        for (int i : randColors) {
            total += i;
        }
        System.out.println("Total games played: " + total);
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

