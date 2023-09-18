package Q1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the speed limit: ");
        int speedlimit = input.nextInt();
        System.out.print("Please enter the vehicle speed: ");
        int carspeed = input.nextInt();
        int speeding = carspeed - speedlimit;
        int fine = 20 + (speeding * 5);
        System.out.print("The fine is $" + fine);
    }
}

/*
Please enter the speed limit: 30
Please enter the vehicle speed: 42
The fine is $80
 */