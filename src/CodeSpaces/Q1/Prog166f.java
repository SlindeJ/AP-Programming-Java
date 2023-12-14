package CodeSpaces.Q1;

public class Prog166f {
    public static void main(String[] args) {
        int start = 100;
        int end = 110;
        while (start < end + 1) {
            int relay = 1;
            int total = 0;
            while (relay < start + 1) {
                total += relay;
                relay++;
            }
            System.out.println("The sum of the numbers 1 to " + start + " is " + total);
            start++;
        }

    }
}
/*
 * The sum of the numbers 1 to 100 is 5050
The sum of the numbers 1 to 101 is 5151
The sum of the numbers 1 to 102 is 5253
The sum of the numbers 1 to 103 is 5356
The sum of the numbers 1 to 104 is 5460
The sum of the numbers 1 to 105 is 5565
The sum of the numbers 1 to 106 is 5671
The sum of the numbers 1 to 107 is 5778
The sum of the numbers 1 to 108 is 5886
The sum of the numbers 1 to 109 is 5995
The sum of the numbers 1 to 110 is 6105
 */