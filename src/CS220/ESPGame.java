package CS220;

import java.util.Scanner;
import javax.swing.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
            // colors are red, green, blue, yellow, purple
        String output = "";
        while(true) {
            String input = (String) JOptionPane.showInputDialog(null, "Enter a color: r(red), g(green),b(blue), y(yellow), p(purple):\nEnter q to quit", "ESP game", JOptionPane.QUESTION_MESSAGE); // Initial choice is "Red" here
            if (input == null || Character.toLowerCase(input.trim().charAt(0)) == 'q') //cancel button is clicked or 'q' is entered
                break;
            output += input + " ";
            System.out.println(input);
        }
        System.out.println(output);
//
        output = "";
        String[] list = { "Red", "Blue", "Green", "Yellow", "Purple"};
        while(true) {
            String input = (String) JOptionPane.showInputDialog(null, "Choose a color:", "ESP game", JOptionPane.QUESTION_MESSAGE, null, // Use default icon
            list, // Array of choices
                    list[0]); // Initial choice is "Red" here
            if (input == null) //cancel button is clicked
                break;
            output += input + "\t";
            System.out.println(input);
        }
        System.out.println(output);
    }
}

