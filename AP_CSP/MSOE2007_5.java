import java.util.*;

public class MSOE2018_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = input.next();
        String[] arr = str.split("");
        int reps = 0;
        int maxReps = 0;
        String curStr = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i+1])) {
                reps++;
                if (reps > maxReps) {
                    maxReps = reps;
                    curStr = arr[i];
                }
            }
        }
        System.out.println(maxReps + " " + curStr);
    }
}

