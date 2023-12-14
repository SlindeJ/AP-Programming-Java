package CodeSpaces.Q1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number you dislike: ");
        int num = input.nextInt();
        System.out.println("   " + num);
        System.out.println("X  9\n");
        int num9 = num * 9;
        System.out.println("   " + num9);
        System.out.println("X  12345679\n");
        int fnum = num9 * 12345679;
        System.out.print(fnum + " Surprise!");


    }

}

/*
Please enter a number you dislike: 5
   5
X  9

   45
X  12345679

555555555 Surprise!
Process finished with exit code 0
 */
