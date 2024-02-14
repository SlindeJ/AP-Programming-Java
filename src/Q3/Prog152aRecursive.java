package Q3;

public class Prog152aRecursive {
    public static int thingy(int num) {
        if (num == 9669) { return 9669; }
        return thingy(num + 3) + num;
    }
    public static void main(String[] args) {
        System.out.println("The sum of the multiples of 3 to 9669 is " + thingy(3));
    }
}
/*
The sum of the multiples of 3 to 9669 is 15586428
 */
