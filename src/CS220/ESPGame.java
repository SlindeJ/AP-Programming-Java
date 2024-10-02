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
                case "g": colors[1]++;
                case "b": colors[2]++;
                case "y": colors[3]++;
                case "p": colors[4]++;
            }
            System.out.println(input);
            randColors[returnRand()]++;
        }
        System.out.println(colors.toString());
        System.out.println(randColors.toString());
    }

    public static int returnRand() {    // returns int between 0 - 4
        return (int) (Math.random() * 5);
    }
}

