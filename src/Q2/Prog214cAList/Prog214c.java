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
                String gasType = input.next();
                double gallons = input.nextDouble();
                String carWashAnswer = input.next();
                if (carWashAnswer.equals("Y")) { carWash = true; }
                AList214c helper = new AList214c(gallons, gasType, carWash);
                list.add(helper);
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                AList214c helper = list.get((lcv));
                helper.calc();
                helper.finprint();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Gallons: 15.00	Gas Type: P	Car wash: false	Cost of gas: 22.19	Final cost: 22.19
Gallons: 21.40	Gas Type: R	Car wash: true	Cost of gas: 29.08	Final cost: 29.08
Gallons: 7.50	Gas Type: H	Car wash: true	Cost of gas: 10.72	Final cost: 10.72
Gallons: 17.90	Gas Type: R	Car wash: true	Cost of gas: 24.33	Final cost: 24.93
 */