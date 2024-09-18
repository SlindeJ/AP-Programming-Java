package CS220.week3;
/** 
 * This program test a user input number to 
 * verify that it is in the proper format:
 * 7 digits with first 3 digits are letters, and the rest 4 digits are numbers
 */

import javax.swing.JOptionPane;

public class InputCharacterValidation {

	public static void main(String[] args) {

		String input; // to hold the user's input

		// get a user input
		input = JOptionPane.showInputDialog(
				"Enter " + "a ticket number in the form LLLNNNN\n" + "(LLL = letters and NNNN = numbers)");
		// Validate the input.
		if (isValid(input)) {
			JOptionPane.showMessageDialog(null, "That's a valid ticket number.");
		} else {
			JOptionPane.showMessageDialog(null,
					"That's not the proper format of a ticket number.\n" + "Here is an example:  ABC1234");
		}

	}// end of main

	public static boolean isValid(String userInput) {
		boolean goodSoFar = true; // flag

		// Test the length
		if (userInput == null || userInput.isBlank() || userInput.length() != 7)
			goodSoFar = false;

		else {
			for (int i = 0; i < 3; i++) { // Test the first three characters for letters
				char inputChar = userInput.charAt(i); // use String.charAt(index) method to grab each character in the
														// string
				if (!Character.isLetter(inputChar)) {
					goodSoFar = false;
					break;
				}
			}
			for (int i = 3; i < userInput.length(); i++) { // Test the last four characters for digits
				char inputChar = userInput.charAt(i);
				if (!Character.isDigit(inputChar)) {
					goodSoFar = false;
					break;
				}
			}
		}

		return goodSoFar;
	}
}// end of class InputCharacterValidation
