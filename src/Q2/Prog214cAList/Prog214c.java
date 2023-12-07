package Q2.Prog214cAList;
import java.util.*;

public class Prog214c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gallons of gasoline purchased: ");
        double gallons = input.nextDouble();
        System.out.print("Type of gas purchased (R, P, H): ");
        String gasType = input.nextLine();
        System.out.print("Would you like a car wash? (Y/N): ");
        String carWashAnswer = input.nextLine();
        boolean carWash = false;
        if (carWashAnswer.equals("Y")) { carWash = true; }
    }
}
