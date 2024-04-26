import java.util.*; 

public class MSOE2018_9 {
    public static void main(String[] args) {
        double r = 3963.1;
        double PII = 3.14159; 
        Scanner input = new Scanner(System.in); 
        System.out.print("Please enter your latitude: "); 
        double a1 = input.nextDouble() * PII / 180; 
        System.out.print("Please enter your longitude: "); 
        double o1 = input.nextDouble() * PII / 180; 
        System.out.print("Please enter your latitude: "); 
        double a0 = input.nextDouble() * PII / 180; 
        System.out.print("Please enter your latitude: "); 
        double o0 = input.nextDouble() * PII / 180;

        double dist = r * Math.acos(Math.cos(a0)*Math.cos(o0)*Math.cos(a1)*Math.cos(o1)+Math.cos(a0)*Math.cos(a1)*Math.sin(o0)*Math.sin(o1)+Math.sin(a0)*Math.sin(a1)); 
        System.out.println(dist); 
        
    }
}

