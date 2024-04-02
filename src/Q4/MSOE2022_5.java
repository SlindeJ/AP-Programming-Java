package Q4;
import java.util.*;

public class MSOE2022_5 {
    public static int recursive(int[] shells) {
        int z = 0;
        for (int x : shells) {
            if (x == 0) { z++; }
        }
        if (z == shells.length) { return 0; }
        int hundred = 100;
        for (int j = 0; j < shells.length; j++) {
            if (hundred > 0 && shells[j] > 0 && hundred > shells[j]) {
                hundred -= shells[j];
                shells[j] = 0;
            }
        }
        return 1 + recursive(shells);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of shells: ");
        int numShells = input.nextInt();
        int[] shells = new int[numShells];
        for (int i = 0; i < numShells; i++) {
            System.out.print("Shell " + (i+1) + ": ");
            shells[i] = input.nextInt();
        }
        System.out.println("You need " + recursive(shells) + " buckets");
    }
}
/*
Please enter the number of shells: 7
Shell 1: 71
Shell 2: 19
Shell 3: 59
Shell 4: 59
Shell 5: 10
Shell 6: 2
Shell 7: 99
You need 4 buckets
 */