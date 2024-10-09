//An example to illustrate different types of exceptions
//ArrayIndexOutOfBoundsException, InputMismatchException, ArithmaticException

//import java.util.Arrays;
import java.util.Scanner;

public class ExceptionExamples{

	public static void main(String[] args) {
		//create an array with 3 elements
		int[] grades = {98, 99, 67, 88, 100};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("There are " + grades.length + " students grades are available, which student grade you want to get?");
		System.out.print("Enter the index (1-5): ");
		
		int index = sc.nextInt(); 
		System.out.println ("The " + index + "th grade is: " + grades[index-1]);
		
		/*Case-1: if user enters -1, or 7 as the index, then JVM will throw an exception to deal with this run-time error
		Display an error message says: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 5
		at ExceptionExamples.main(ExceptionExamples.java:17)
		and stop execution of the program
		*/
		
		/*Case-2: if user enters non-integer values: e.g. "ss", "5.5", then JVM will throw an exception to deal with this run-time error
		Display an error message says: 
		Exception in thread "main" java.util.InputMismatchException
		at java.base/java.util.Scanner.throwFor(Scanner.java:939)
		at java.base/java.util.Scanner.next(Scanner.java:1594)
		at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
		at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
		at ExceptionExamples.main(ExceptionExamples.java:15)
		and stop execution of the program
		*/	
		
		System.out.print("Enter miles:");
		int miles = sc.nextInt();
				
		System.out.print("Enter gallons: ");
		int gallons = sc.nextInt();
		
		System.out.println("Miles per gallons:  " + miles/gallons);
		
		/*Case-3: Note: if miles or gallons are floating point number type (e.g., double), then JVM will display infinity
		 * if user enters integer value: 0 for gallons,  then JVM will throw an exception to deal with this run-time error
		  Display an error message says: 
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	     at ExceptionExamples.main(ExceptionExamples.java:42)
		*/
		
		
		sc.close();
		}
}
