package Q2.Prog214cAList;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214c.dat")); // remember to replace with new data file
            ArrayList<AList214c> list = new ArrayList<>();

            while (input.hasNext()) {
                boolean carWash = false;
                String gasType = input.nextLine();
                double gallons = input.nextDouble();
                String carWashAnswer = input.nextLine();
                if (carWashAnswer.equals("Y")) { carWash = true; }
                AList214c helper = new AList214c(gallons, gasType, carWash);
                list.add(helper);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
