package CodeSpaces.Q1;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class dfile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat")); // remember to replace with new data file

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
