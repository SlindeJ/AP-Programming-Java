package CS220.week3;

/**
 * The telephone class provides static methods for formatting and 
 * unformatting U.S. telephone numbers.
 */
public class TelephoneStringBuilder {

	//These constant fields hold the valid lengths of strings
	//that are formatted and unformatted
	public final static int FORMATTED_LENGTH = 13;
	public final static int UNFORMATTED_LENGTH = 10;
	
	/** Th isFormatted method determine whether a string is properly formatted as a U.S. telephone
	 * number in the following format:
	 * (XXX)XXX-XXXX
	 * @param str
	 * @return true if the string is properly formatted, or false otherwise.
	 */
	public static boolean isFormatted(String str)
	{
		boolean valid;   //Flag to indicate valid format
		
		//Determine whether str is properly formatted.
		if (str.length() == FORMATTED_LENGTH && 
				str.charAt(0) == '(' &&
				str.charAt(4) == ')' &&
				str.charAt(8) == '-' )
			
			valid = true;
		else
			valid = false;
		
		//return the value of the valid flag. 
		return valid;
	}
    
	/** unformat() method accepts a string containing 
	 * a telephone number formatted as
	 * (XXX)XXX-XXXX.  It the argument is formatted this way
	 * the method returns an unformatted string where the
	 * parentheses and hyphen have been removed. Otherwise,
	 * it returns the original argument
	 * @param str, the string to unformat
	 * @return an unformatted string
	 */
	public static String unformat(String str)
	{
		//create a StringBuilder initialized with str
		StringBuilder strb = new StringBuilder(str);
		// If the argument is properly formatted, then unformat it
		if (isFormatted(str))
		{
			//First, delete the left paren at position 0
			strb.deleteCharAt(0);
			//Next, delete the right paren. Because of the previous deletion
			//it is now located at position 3
			strb.deleteCharAt(3);
			//next, delete the hyphen. because of the previous deletion,
			// now it is located at position 6
			strb.deleteCharAt(6);
			//return unformatted string
			return strb.toString(); 
		}
		else 
			//return a message says the input is not formated properly
			return "invalid format for input phone number, try again!";
		 
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String  format(String str)
	{
		//create a StringBuilder initialized with str.
		StringBuilder strb = new StringBuilder(str);
		
		//If the argument is the correct length, then format it
		if (str.length() == UNFORMATTED_LENGTH)
		{
			//First, insert the left paren at position 0.
			strb.insert(0,  "(");
			//next, insert the right paren at position 4.
			strb.insert(4,  ")");
			//Next, insert the hypen at position 8.
			strb.insert(8,  "-");
		}
		
		//Return the formatted string
		return strb.toString();
	}
	

}// end of Telephone class
