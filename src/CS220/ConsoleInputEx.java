/*
 * This example illustrates variable scope, variable type,
 * console input/output, basic input validation,
 * and use String variable
 */

import java.util.Scanner;

//Note-1: main method must be defined in a class
//Note-2: the class contains the main method should have the same name as the file name
public class ConsoleInputEx {
	/*
	 * (1) "private" declares that variable "myName" is a private field (2) "final"
	 * declares that variable "myName" is defined as a constant variable, myName
	 * will always reference to the same String object "Tina" (3) "static" declares
	 * that myName is a static field, which associates with this class rather than
	 * each object instance of this class (4) "String" declares the type of myName
	 * is a reference variable referencing a String object (5) define myName before
	 * any methods in this class, give this variable a class scope that means myName
	 * is a field inside this class, all methods can access this variable directly
	 * no need to pass it into those methods as arguments
	 */
	private final static String myName = "Tina"; //

	public static void main(String[] args) { // parameter args is a local variable as well
		// declare a constant int variable "myLuckyNumber".
		// this variable is defined inside main method, it is a local variable
		// it is visible inside main method only
		final int myLuckyNumber = 3;

		// use Scanner object to get user keyboard input from console
		Scanner userInput = new Scanner(System.in);

		// get user name input as a string by calling nextLine() method (from Scanner
		// object)
		// remove all leading and ending whitespace by calling strip() method (from
		// String object)
		System.out.println("Enter your name: ");
		String userName = userInput.nextLine().strip();

		// get user lucky number as an integer by calling nextInt() method (from Scanner
		// object)
		System.out.println("What is your lucky number? (enter a number between 0 and 100)");
		int userLuckyNumber = -1;
		userLuckyNumber = userInput.nextInt();
		/*
		 * try { userLuckyNumber = userInput.nextInt(); } catch(Exception e) {
		 * System.out.println("You entered :" + userInput.nextLine() +
		 * "\nInvalid lucky number input! must be a number between 0 and 100.");
		 * System.exit(1); }
		 */
		boolean validInput = true;
		String output = "";

		// data validation: name input can not be empty
		if (userName.isEmpty()) {
			output = "Name can not be empty! Try again!\n";
			validInput = false;
		}

		// data validation: lucky number can not be negative or greater than 100
		if (userLuckyNumber < 0 || userLuckyNumber > 100) {
			output += "LuckyNumber must between 0 and 100! Try again!";
			validInput = false;
		}

		if (!validInput) {
			System.out.println(output);
			System.exit(1); // any non-zero integer argument indicates there is
			// something wrong when executing the program, the program terminated abnormally
		} else { // all user inputs are valid, print out user information
					// compare user name and lucky number, and generate outputs
					// capitalize first character in the string by using
					// substring() and toUpperCase() method (from String class)
					// String.format() is similar to System.out.printf(), but return a String
			output = String.format("Hello %s!",
					userName.substring(0, 1).toUpperCase() + userName.substring(1).toLowerCase()); // "Hello " +
																									// userName + "!"
			if (userName.equalsIgnoreCase(myName)) { // userName.toLowerCase().equals(myName.toLowerCase())
				output += "\nWe have the same name!";
			} else {
				output += "\nMy name is: " + myName;
			}
			System.out.println(output);

			output = String.format("Your lucky number: %d", userLuckyNumber);
			output += (userLuckyNumber == myLuckyNumber) ? "\nWe have the same lucky number!"
					: "\nMy lucky number is " + myLuckyNumber;

			System.out.println(output);
		}

		userInput.close();
	}

	/*
	 * Discussion and Practice: create separate methods to get user inputs, compare
	 * user inputs and print out user info
	 */

}
