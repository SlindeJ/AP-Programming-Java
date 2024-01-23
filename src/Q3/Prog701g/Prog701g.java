package Q3.Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat")); // remember to replace with new data file
            List<Person> list = new ArrayList<Person>();    // list of the parent class

            // Note to self: the get method for teacher is probably not the same as Szelogowski's

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
