package CodeSpaces.Q1;
import java.util.*;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lcv = 0;
        String password = "potato";        
        while (lcv < 3) {
            System.out.print("What is the password? ");
            String attempt = input.nextLine();
            if (attempt.equals(password)) {
                System.out.println("Welcome");
                break;
            } else {
                if (lcv == 2) {
                    lcv++;
                    System.out.println("--Access Denied--");
                    break;
                }
                System.out.println("The password you typed was incorrect.");
                lcv++;
            }
        }
        
    }
    
}
/*
 * What is the password? nou
The password you typed was incorrect.
What is the password? uno
The password you typed was incorrect.
What is the password? eee
--Access Denied--

2nd run
What is the password? potato
Welcome
 */