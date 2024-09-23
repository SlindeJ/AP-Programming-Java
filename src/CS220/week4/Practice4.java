
/**
 * shows examples of number literal starts with 0 or 0x
 */
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		//Note-1: number literal starts with 0 will be treated as an octal (base-8) number.
		int num = 0123;  // the value of num is 83
        System.out.println(num); //1*8^2 + 2*8 + 3 = 64 + 16 + 3 = 83
        
        //Note-2: number literal starts with 0x will be treated as a hexadecimal (base-16) number
        int num2 = 0x123; // the value of num2 is 291
        System.out.println(num2); //1*16^2 + 2*16 + 3 = 256 + 32 + 3 = 291
        
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        //num = input.nextInt();//leading 0 will be omitted
        //System.out.println("You entered: " + num);
        //input.close();
        

        //int[] intArray = new int[6];
        //int[] array2 = null;
        int[] intArray = {4, 5, 89, 1, 8, 10};
        int[] array2 = intArray;
        System.out.println(intArray); //return the hash code of the object that intArray variable references
        System.out.println(array2); //return the hash code of the object that array2 variable references
        
        System.out.println("Enter a string: ");
        String stringArray = input.nextLine();
        System.out.println(stringArray.length());
        System.out.println(stringArray.isEmpty());
        
        System.out.printf("%10s%10s%n","Quantity", "Price");
        System.out.printf("%10d%10.2f%n", 1, 1*23.4);
        System.out.printf("%-10d%-10.2f%n", 1, 1*23.4);
        
        input.close();
	}

}
