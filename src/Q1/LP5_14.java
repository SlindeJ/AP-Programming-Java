package Q1;
import java.util.Random;

public class LP5_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Dice 1\tDice 2\tTotal");
        for (int lcv = 1; lcv < 6; lcv++) {
            int D1 = rand.nextInt((6 - 1) + 1) + 1;;
            int D2 = rand.nextInt((6 - 1) + 1) + 1;;
            int total = D1 + D2;
            System.out.println(D1 + "\t" + D2 + "\t" + total);
        }
    }
    
}
/*
Dice 1  Dice 2  Total
2       6       8
1       5       6
1       3       4
1       1       2
6       1       7
 */ 