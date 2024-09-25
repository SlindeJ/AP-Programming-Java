package CS220.week4;
import java.util.*;
import java.util.Scanner;

public class week4LAB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] seats = new int[8][8];
        System.out.println("This is the seating chart just for reference");
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                seats[row][col] = (10 - (row + 1)) * 10;
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int totalPrice = 0;
        System.out.println("Enter the seat you want in row-col format, enter 'end' to exit");
        while (input.hasNext()) {       // read in function
            String s = input.next();
            if (s.equals("end")) {
                System.out.println("The total price of the seats is: $" + totalPrice);
                System.out.println("Seats bought: " + findSeatsBought(seats)); // call function to search for indexes with value == 0
                System.exit(0);
            } else {
                int r = Integer.parseInt(s.trim().split("-")[0]);
                int c = Integer.parseInt(s.trim().split("-")[1]);
                totalPrice += sellSeat(r, c, seats); // return seat price and or print already sold
                seats[r-1][c-1] = 0;
            }
        }
    }

    public static int sellSeat(int r, int c, int[][] seats) {
        int row = r-1;
        int col = c-1;
        if (seats[row][col] == 0) {
            System.out.println("Seat " + (row+1) + "-" + (col+1) + ", is not available anymore");
        }
        return seats[row][col];
    }

    public static ArrayList findSeatsBought(int[][] seats) {
        ArrayList seatsBought = new ArrayList();
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == 0) {
                    seatsBought.add((row+1) + "-" + (col+1));
                }
            }
        }
        return seatsBought;
    }
}
