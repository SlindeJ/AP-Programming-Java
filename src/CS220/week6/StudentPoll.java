package CS220.week6;// StudentPoll.java
// An example of using try-catch block
// Poll analysis program.

public class StudentPoll {
	public static void main(String[] args) {
		// student response array (more typically, input at runtime)
		int[] responses = { 12, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		// (1) try this: change 1st response to 12, what the outputs from the program?
		// (2) add try-catch block to handle the exception, and ignore the invalid
		// response and continue the program to get the frequency statistics
		int[] frequency = new int[6]; // array of frequency counters

		// for each answer, select responses element and use that value
		// as frequency index to determine element to increment
		for (int answer = 0; answer < responses.length; answer++) {

			// add try and catch blocks in this for loop
			try {
			++frequency[responses[answer]]; }
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				e.getStackTrace();	// find error position
			}

		}

		System.out.printf("%s%10s%n", "Rating", "Frequency");

		// output each array element's value
		for (int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
		}
	}
}
