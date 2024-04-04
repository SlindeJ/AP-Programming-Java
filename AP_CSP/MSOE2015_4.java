import java.util.*; 

public class MSOE2015_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter 10 floating point numbers: "); 
        double[] arr = new double[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i+1) + ": "); 
            arr[i] = input.nextDouble(); 
            if (i >= 2) {
                
                double[] uniquearr = Arrays.sort(arr); 
                for (int k = 0; k < uniquearr.length-1; k++) {
                    if (uniquearr[k] == uniquearr[k+1]) {
                        // need to remove item at index k here
                    k--; } }
                int third = uniquearr.length-3; 
                if (third < 0) third = 0; 
                System.out.println(uniquearr[third]); 
            }
        }
        
    }
}