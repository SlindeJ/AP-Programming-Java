package Q1;
import java.util.*;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        int degrees = input.nextInt();
        double rads = degrees * 3.14159 / 180;
        double sin = Math.sin(rads);
        double cos = Math.cos(rads);
        double tan = Math.tan(rads); 
        System.out.printf("Sine: %.3f\n", sin);
        System.out.printf("Cosine: %.3f\n", cos);
        System.out.printf("Tangent: %.3f\n", tan);
    }
    
}
/*
 * Enter an angle in degrees: 30
Sine: 0.500
Cosine: 0.866
Tangent: 0.577
 */