package Q2;
import java.util.Scanner;

public class MSOE2016_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is radius 1?: ");    // r > 0
        double rad1 = input.nextDouble();
        System.out.print("What is radius 2?: ");    // r < 0
        double rad2 = input.nextDouble();
        System.out.print("What is the refractive index?: ");    // n > 1
        double n = input.nextDouble();
        System.out.print("What is the lens thickness?: ");
        double d = input.nextDouble();
        double f = 1 / ((n-1)*Math.abs(1/rad1 - 1/rad2 + ((n-1)*d)/(n*rad1*rad2)));

        System.out.printf("The focal length of the lens is %.2f\n", f);
    }
}
/*
What is radius 1?: 4
What is radius 2?: -5
What is the refractive index?: 2.7
What is the lens thickness?: 8
The focal length of the lens is 2.97
 */