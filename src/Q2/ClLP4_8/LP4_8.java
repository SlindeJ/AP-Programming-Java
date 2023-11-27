package Q2.ClLP4_8;
import java.util.*;

public class LP4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the seed? ");
        int seed = input.nextInt();
        System.out.print("What is a? ");
        int a = input.nextInt();
        System.out.print("What is c? ");
        int c = input.nextInt();
        System.out.print("What is m? ");
        int m = input.nextInt();
        for (int lcv = 0; lcv <= 10; lcv++) {
            Cl4_8 helper = new Cl4_8(a, c, m, seed);
            System.out.println(helper.toString());
            seed = helper.nextInt();
        }
    }
}
/*
What is the seed? 12
What is a? 1246
What is c? 200
What is m? 50
(1246 * 12 + 200)  50 = 2
(1246 * 42 + 200)  50 = 32
(1246 * 22 + 200)  50 = 12
(1246 * 2 + 200)  50 = 42
(1246 * 32 + 200)  50 = 22
(1246 * 12 + 200)  50 = 2
(1246 * 42 + 200)  50 = 32
(1246 * 22 + 200)  50 = 12
(1246 * 2 + 200)  50 = 42
(1246 * 32 + 200)  50 = 22
(1246 * 12 + 200)  50 = 2
 */