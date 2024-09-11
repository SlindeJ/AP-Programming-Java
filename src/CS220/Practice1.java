
import test.Test; //Test class is public accessible
//import test.Test2; //Test2 class is package accessible, outside the package test, Test2 cannot be accessed

//package is used to group related classes and interfaces that share a common purpose or functionality
//package is actually a folder that contains those related class and interface files
//for example, in Java API, classes and interfaces are grouped into different packages;
//https://docs.oracle.com/javase/8/docs/api/
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html

public class Practice1 {
	public static void main(String[] args) {
		// add single line comment
		/*
		 * add multiple line comments!
		 */
		System.out.println("Hello World!");
		System.out.print("Welcome to CS220!\n");
		System.out.printf("%s%n", "Programming is fun!");

		Test.print();
		// Test2.print(); //can not call print() method defined in Test2 class since
		// Test2 class is at the package level

		// System.out.println(args[0]); //requires to add args (e.g., use command line
		// or run with configuration) when start running the program

		/*
		 * "final" is a keyword that is used to define named constants, also used to
		 * prevent re-referencing a reference variable, to prevent overriding a method
		 * to prevent inheritance
		 */
		final int MAX = 100;
		// MAX += 1; //not allow to update its value
		final String folder = "cs220/";
		String subfolder = "src/";
		// folder = folder + subfolder; //not allow to change its reference to reference
		// another object

		// print out unicode of a char, char data is treated as a number internally
		char testChar = 'a' + 1;
		System.out.println((int) '中'); // use type cast to display unicode of a character
		System.out.println(testChar);
		System.out.println((char) 26089); // type cast an integer to a character

		// floating-point number imprecision issue
		System.out.println("5.6 + 5.8 = " + (5.6 + 5.8));
		System.out.printf("5.6 + 5.8 = %.2f \n", (5.6 + 5.8));
		// use printf() to display the floating point number with fixed number of
		// decimal places

		// How to round a decimal number? Math.round() round a decimal number to the
		// nearest integer in "long" integer type
		double result = 5.64 + 9.91234;
		double resultR1 = Math.round(result * 10) / 10.0;
		System.out.println("with 1 decimal place: " + resultR1);

		double resultR2 = Math.round(result * 1000) / 1000.0;
		System.out.println("with 3 decimal places: " + resultR2);

		// Dealing with money amount, an example showing the floating-point number
		// imprecision issue
		// to fix this problem, solution-1: use rounding method: Math.round()
		// for example,
		double m1 = 5.01; // $5.01, another example to try: $5.60
		double m2 = 5.10; // $5.10, another example to try: $5.99

		double total = m1 + m2; // total money amount, $10.11
		System.out.println("Total: $" + total);

		// get dollar amount from total, and get cents part from total
		int dollars = (int) total; // use type casting here to get integer part of a floating point number
		System.out.println("number of cents: " + (total - dollars) * 100);
		int cents = (int) ((total - dollars) * 100);
		// can not display accurate result, expecting 11 cents, but result is 10 cents
		// due to imprecision issue
		// in the calculation involving floating-point number
		System.out.println(m1 + " + " + m2 + " = " + dollars + " dollars and " + cents + " cents");
		// to fix it, simplified approach:
		int centsV2 = (int) Math.round((total - dollars) * 100);
		// here need to type casting long int to int
		System.out.printf("with Correction: $%.2f + $%.2f = %d dollars and %d cents.\n", m1, m2, dollars, centsV2);

		// solution-2: avoid to use floating-point number for money amount
		// dealing with money amount by using integers.
		// (i.e., use 540 cents instead of 5.4 dollars in the program)

		// use subString
		String test = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(test.substring(0, 1));
		System.out.println(test.substring(2));
		System.out.println(test.substring(4, 9));
		// System.out.println(test.substring(-1, -3)); // in Java substring() method
		// does not support negative index
		System.out.println(test.substring(test.length() - 3));
	}

}
