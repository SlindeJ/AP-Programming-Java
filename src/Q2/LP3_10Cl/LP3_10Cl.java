package Q2.LP3_10Cl;
import java.util.*;

public class LP3_10Cl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // burger fries sodas
        System.out.print("Enter the amount of burgers: ");
        int burgers = input.nextInt();
        System.out.print("Enter the amount of fries: ");
        int fries = input.nextInt();
        System.out.print("Enter the amount of sodas: ");
        int sodas = input.nextInt();
        Cl3_10 helper = new Cl3_10(burgers, fries, sodas);
        helper.calc();
        System.out.printf("Total before tax: $%.2f\n", helper.getMealCost());
        System.out.printf("Tax: $%.2f\n", helper.getTaxCost());
        System.out.printf("Final total: $%.2f\n", helper.getfCost());
        System.out.print("Enter amount tendered: ");
        double tended = input.nextDouble();
        System.out.printf("Change: $%.2f", (tended - helper.getfCost()));
    }
}
/*
Enter the amount of burgers: 2
Enter the amount of fries: 5
Enter the amount of sodas: 5
Total before tax: $13.78
Tax: $0.90
Final total: $14.68
Enter amount tendered: 20.00
Change: $5.32
 */