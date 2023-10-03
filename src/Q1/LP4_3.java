package Q1;
import java.util.*;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of eggs purchased: ");
        double eggs = input.nextDouble();
        double dozen = eggs / 12;
        double price = 1;
        if (dozen < 4) {
            price = 0.5;
        } else if (4 <= dozen && dozen < 6) {
            price = 0.45;
        } else if (6 <= dozen && dozen < 11) {
            price = 0.4;
        } else if (11 <= dozen) {
            price = 0.35;
        }
        double total = price * dozen;
        System.out.printf("The bill is equal to: $%.2f\n", total);
    }
    
}
/*
 * Please enter the number of eggs purchased: 18
The bill is equal to: $0.75
 */