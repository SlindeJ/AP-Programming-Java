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
            } else {
                reps = 0; 
            }
        }
        maxReps++; 
        System.out.print(maxReps + " ");
        boolean notSame = false;
        String sub = ""; 
        for (int lcv = 0; lcv < arr.length - (maxReps-1); lcv++) {    // trying to get the letters to show here
            sub = str.substring(lcv, maxReps+lcv); 
            notSame = false;
            for (int lcv2 = 0; lcv2 < sub.length()-1; lcv2++) {
                if (!sub.substring(lcv2, lcv2+1).equals(sub.substring(lcv2+1, lcv2+2))) {
                    notSame = true; 
                }
            }
            if (!notSame) {
                lcv += maxReps-1; 
                System.out.print(sub.substring(0, 1) + " "); 
            }
        }
        System.out.println(); 
    }
}
/*
Please enter the string: lllmmmnnnoooppp
3 l m n o p 
@SlindeJ ➜ /workspaces/AP-Programming-Java/AP_CSP (master) $ java MSOE2007_5.java
Please enter the string: lkjsl;kjlkvjlkjlsjjjjdjakekkkejlvjalkkkdjxnndneijkjvkajkjkekkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
35 k 
*/