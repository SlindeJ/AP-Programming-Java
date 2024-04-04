import java.util.*; 

public class MSOE2015_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter 10 floating point numbers: "); 
        double[] arr = new double[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i+1) + ": "); 
            arr[i] = input.nextDouble(); 
        }
        
    }
}