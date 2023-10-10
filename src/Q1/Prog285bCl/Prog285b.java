package Q1.Prog285bCl;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog285b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/Prog285b.dat"));
            System.out.println("Id\tCode\tSales\tCommission");
            while (input.hasNext()) {
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();

                Salesperson fred = new Salesperson(id, c, s);
                fred.setComm();
                System.out.println(fred.toString());    // println(fred)
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
