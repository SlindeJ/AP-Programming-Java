package CodeSpaces.Q1;
import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = cool.nextLine().toLowerCase().trim();

//        int Acount = 0;
//        int Bcount = 0;
//        int Ccount = 0;
//        int Dcount = 0;
//        int Ecount = 0;
//        int Fcount = 0;
//        int Gcount = 0;
//        int Hcount = 0;
//        int Icount = 0;
//        int Jcount = 0;
//        int Kcount = 0;
//        int Lcount = 0;
//        int Mcount = 0;
//        int Ncount = 0;
//        int Ocount = 0;
//        int Pcount = 0;
//        int Qcount = 0;
//        int Rcount = 0;
//        int Scount = 0;
//        int Tcount = 0;
//        int Ucount = 0;
//        int Vcount = 0;
//        int Wcount = 0;
//        int Xcount = 0;
//        int Ycount = 0;
//        int Zcount = 0;


// make a for loop that runs for every index? in the string
// then make a for loop that goes through the string and finds if any char is equal to the current char and remove that one
// then keep resetting the value for the length of the string so you don't "miss" the target char
// run until done and len of new string are all unique chars
        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            while (mytext.indexOf(cur) != mytext.lastIndexOf(cur)) {
                mytext = mytext.substring(0, mytext.lastIndexOf(cur)) + mytext.substring(mytext.lastIndexOf(cur) + 1);
            }
        }
        System.out.println("The amount of unique characters in the string is: " + mytext.length());
        System.out.println(mytext);
    }
}
/*
Enter a string: jjnaskljdjKLSIUQKJDIJ!@#$%^
The amount of unique characters in the string is: 16
jnaskldiuq!@#$%^
 */
