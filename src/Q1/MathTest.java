package Q1;

public class MathTest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); //2^3

        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int num4 = 5;
        int sum = num1 + num2 + num3 + num4;
        sum /= 4;   // sum = sum / 4

        num1 = num1 + 5;
        num1 += 5;
        num1++; // same as num1 + 1


        // Arithmetic ops: + - * / %
        // Assignment ops: = += -= *= /= %= ++ --

        int test = 3/4;
        System.out.println(test);

        double myWallet = 2983.5346335;
        double myWRounded = Math.round(myWallet * 100.0) / 100.0;

        System.out.println(myWRounded);
        System.out.printf("myWRounded = %.2f\n", myWallet);     // %.f  # of decimals
    }
}


/*
0
2983.53
myWRounded = 2983.53
 */