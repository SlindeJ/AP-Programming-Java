package Q1;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class LP4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int compnum = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        System.out.print("Please pick a number between 1 and 20: ");
        int pnum = input.nextInt();
        System.out.println("Computer's number: " + compnum);
        System.out.println("Player's number: " + pnum);
        if (compnum == pnum) {
            System.out.println("You won!!");
        } else {
            System.out.println("Better luck next time");
        }
    }
    
}
/*
 * Please pick a number between 1 and 20: 7
Computer's number: 7
Player's number: 7
You won!!
 */