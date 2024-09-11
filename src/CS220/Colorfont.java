public class Colorfont {
	// ANSI escape code constants for text colors
	final static String RESET = "\u001B[0m";
	final static String RED = "\u001B[31m";
	final static String GREEN = "\u001B[32m";
	final static String YELLOW = "\u001B[33m";

	public static void main(String[] args) {
		// Print colored text to the console
		System.out.println(GREEN + "This text is green." + RESET);
		System.out.println(YELLOW + "This text is yellow." + RESET);
		System.out.println(RED + "This text is red." + RESET);
		System.out.println("This text is black (the default).");
	}

}
