package Q4;
import java.util.*;

public class MSOE2022_5 {
    public int recursive(int i) {       // recursive function that would alter the shells array and keep
        // iterating to find if shells fit in the extra space of a bucket. maybe??
        return -1;
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

    }


}
