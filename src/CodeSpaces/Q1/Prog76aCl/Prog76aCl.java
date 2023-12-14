package CodeSpaces.Q1.Prog76aCl;
import java.util.*;

public class Prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number you dislike: ");
        int num = input.nextInt();
            // * 12345679

        Cl76a helper = new Cl76a(num);
        helper.calc();
        num = helper.getNum();

        System.out.println(num + " Surprise!!!!!!!!");
    }
}
