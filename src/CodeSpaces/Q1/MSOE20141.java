package CodeSpaces.Q1;
import java.util.*;


public class MSOE20141 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcount = 0;

        for (int lcv = 0; lcv < word.length() - 1; lcv++) {
            String cLetter = word.substring(lcv, lcv + 1);  // grab [lcv]
            String nLetter = word.substring(lcv + 1, lcv + 2);  // grab [lcv + 1]
            if (cLetter.equals(nLetter))
                dblcount++;  // can't use string1 == string2 because they are objects, would check for same memory address
        }
        System.out.printf("%s contains %d double letters\n", word, dblcount);
    }
}
/*
Enter a word: MiSsIssipPi
mississippi contains 3 double letters
 */
