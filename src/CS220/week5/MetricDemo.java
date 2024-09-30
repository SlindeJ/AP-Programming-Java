import java.util.InputMismatchException;
import java.util.Scanner;

/** This program demonstrates the Metric class.
 */
public class MetricDemo {

	public static void main(String[] args) {
	
		double miles; // A distance in miles
		double kilos; // A distance in kilometers
		
		//Get a distance in miles
		Scanner sc = new Scanner (System.in);
		  miles = readInput("Enter a distance in miles: ", sc);
		  kilos = Metric.milesToKilometers(miles);
		System.out.printf("%,.2f miles => %,.2f kilometers.\n", miles, kilos);  
		
		//Get a distance in kilometers
		  kilos = readInput("Enter a distance in kilometers: ", sc);
		  miles = Metric.kilometersToMiles(kilos); 
		System.out.printf("%,.2f kilometers => %,.2f miles.\n", kilos, miles);   
	}	
	
	//handle run-time input exceptions: negative double and input mismatch
	   public static double readInput(String message, Scanner sc) {
		   double num = 0;
		   while (true)
		   {
			   System.out.print(message);
			   try {
				   num = sc.nextDouble();
				   if (num < 0) {  
					//   String errMsg = "Entered a negative number " + num;
					  // throw new InputMismatchException(errMsg);
					   throw new InputMismatchException();
				   }
				   else break; 
			   }
			   catch(InputMismatchException e) {
				  // System.out.println(e.getMessage());
				   System.err.println("Invalid input! Try again!");
				   sc.nextLine(); //to ignore invalid input, i.e., take invalid input from input stream buffer
			   }
			
		   }
		   
		   return num;
	   }

}
