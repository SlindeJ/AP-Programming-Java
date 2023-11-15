package Q2;
import java.util.Scanner;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // input
        System.out.print("Please enter a lowercase word: ");
        String word = scnr.nextLine();
        boolean pal = true;
        for (int lcv = word.length()-1; lcv > 0; lcv -=1) {
            if (word.substring(word.length() - lcv - 1, word.length() - lcv).equals(word.substring(lcv, lcv+1))) {
                pal = true;
            } else {
                pal = false;
                break;
            }
        }
        if (pal) System.out.println("The word is a palindrome");
        else System.out.println("Not a palindrome");
    }
}
