package Q2;
import java.util.Scanner;

public class MSOE2016_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of side a: ");
        double sideA = input.nextDouble();
        System.out.print("Please enter the length of side c: ");
        double sideC = input.nextDouble();
        System.out.print("Please enter the degree measure of angle A: ");
        double angleA = input.nextDouble();
        angleA = angleA * 3.14159 / 180;
        double angleC = Math.asin(Math.sin(angleA) * sideC / sideA);
        System.out.printf("The measure of angle C is %.2f degrees", toDeg(angleC));
    }
    public static double toDeg(double rads) {
        return rads * 180 / 3.14159;
    }
}
