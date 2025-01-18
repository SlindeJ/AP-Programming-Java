package Chem_Database.Periodic_Table;
import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) {


        ArrayList<Element> elements = new ArrayList<>(118);


        try {
            File elementFile = new File("src/Chem_Database/Periodic_Table/elementFile");
            Scanner readIn = new Scanner(elementFile);
            while (readIn.hasNextLine()) {
                String data = readIn.useDelimiter(",").next();
                System.out.println(data);
            }
            readIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}




        // the idea is the have all info on in one question
        // hopefully I will be able to use Math.Rand to give only one piece of information and the rest has to be deduced.
        // I would also like to be able to keep track of how many element were gotten completely correct and how many had some wrong info
// required info:
// element name
// abbreviated element name/symbol
// periodic number
// molecular mass
