package CS220.week3;// ValidateInput.java
// Validating user information using regular expressions.


public class ValidateInputRex {
	// validate first name
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
		// The first character should be upper-case letter, and the rest of characters
		// in the name should matches either upper- or
		// lower-case letters. use * instead of + here to include the case that the name
		// contains only one character
	}

	// validate last name
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[A-Z][a-zA-Z]*");
	}

	// validate address
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+ | [a-zA-Z]+\\s[a-zA-Z]+)");
		// \\d+\\s+ means matches one or more digits, followed by one or more white
		// spaces,
		// ([a-zA-Z]+ | [a-zA-Z]+\\s[a-zA-Z]+) means followed by one or more characters
		// or
		// followed by one or more characters with
		// whitespace and one or more characters
	}

	// validate city
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

	// validate state
	public static boolean validateState(String state) {
		return state.matches("[a-zA-Z][a-zA-Z]");
		// [a-zA-Z][a-zA-Z] means the first and 2nd characters must be upper- or
		// lower-case letters
	}

	// validate zip
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
		// \\d{5} means zip code must be a string with exactly 5 digits
	}

	// validate phone
	public static boolean validatePhone(String phone) {
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
		// [1-9]\\d{2}-[1-9]\\d{2}-\\d{4} means the first character should be a digit
		// 1-9,
		// and then the followed two characters should be digits and followed by "-" and
		// then repeat the same pattern
		// for the next three characters and then "-" again and followed by 4 digits.
	}
}
