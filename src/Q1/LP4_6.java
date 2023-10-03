package Q1;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class LP4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = ThreadLocalRandom.current().nextInt(1, 11);
        int num2 = ThreadLocalRandom.current().nextInt(1, 11);
        System.out.println("What is " + num1 + " * " + num2 + "?");
        int answer = input.nextInt();
        int real_answer = num1 * num2;
        if (answer == real_answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Please try again");
        }

    }
}
/*
What is 5 * 8?
40
Correct!
 */