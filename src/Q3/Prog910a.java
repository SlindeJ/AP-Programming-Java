package Q3;
import java.util.*;

public class Prog910a {
    public static String decToBinary(int num) {
        if (num == 0) { return "0"; }
        if (num == 1) {return "1"; }
        return decToBinary(num/2) + num % 2;
    }
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be converted binary: ");
        int num = input.nextInt();
        while (num != -1) {
            System.out.println(decToBinary(num));
            System.out.print("\nEnter the number to be converted to binary: ");
            num = input.nextInt();
        }
    }
}
