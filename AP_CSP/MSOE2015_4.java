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
                double[] uniquearr = arr; 
                Arrays.sort(uniquearr);
                // for (int k = 0; k < uniquearr.length-1; k++) {
                //     if (uniquearr[k] == uniquearr[k+1]) {
                //         // need to remove item at index k here (nevermind)
                //         //k--; 
                //         } 
                //     }
                int third = uniquearr.length-3; 
                if (third < 0) third = 0; 
                System.out.println("The third largest number is: " + uniquearr[third]); 
            }
        }
        
    }
}
/*
Please enter 10 floating point numbers: 
Number 1: 10.1
Number 2: 9.9
Number 3: 3.3
The third largest number is: 3.3
Number 4: 1.1
The third largest number is: 3.3
Number 5: 11
The third largest number is: 9.9
Number 6: 11
The third largest number is: 10.1
Number 7: 15
The third largest number is: 11.0
Number 8: 0.1
The third largest number is: 10.1
Number 9: 7.7
The third largest number is: 7.7
Number 10: 7.6
The third largest number is: 7.6
*/