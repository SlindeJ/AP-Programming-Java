import java.util.*; 

public class MSOE2015_7 {
    public static double dedekind(int num) {
        if (num == 1) { return 1; }
        int i = 2; 
        while (num % i != 0) {
            i++; 
        }
        return (1 + (double)1/i) * dedekind(num/i); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter the number: ");
        int num = input.nextInt(); 
        System.out.println("The Dedekind function number is: " + (int)(num * dedekind(num))); 
    }
}