package Q1.Prog93aCl;
import java.util.*;

public class Prog93aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kilowatts used: ");
        int kWatts = input.nextInt();

        Cl93a helper = new Cl93a(kWatts);
        helper.calc();
        helper.toString();

    }
}
