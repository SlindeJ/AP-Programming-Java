package CS220.week3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		// obtain total milliseconds since midnight, Jan. 1, 1970

		// obtain the total seconds since midnight, Jan. 1, 1970

		// Compute current seconds

		// obtain the total minutes

		// Compute current minute

		// obtain the total hours

		// Compute current hour

		// Display results by using println(),
		// Question(1): how to keep 2-digit format in displaying time (e.g., 09 instead
		// of 9)
		// Solution(1): use String.format() method to convert number to string with the
		// specified format
		// System.out.println("Current UTC/GMT time: \n" +
		// String.format("%02d:%02d:%02d", currentHours, currentMinutes,
		// currentSeconds));
		// Solution(2): use printf() to define format and display numbers
		// System.out.printf("Current UTC/GMT time: \n%02d:%02d:%02d\n", currentHours,
		// currentMinutes, currentSeconds);

		// Question(2): how to display current local date and time in a specified
		// format?
		// Solution: create a Date object, and use SimpleDataFormat to define a format
		// and apply that format
		// by using format() method,
		// https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

		// Example-1
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Current local time (USA center):\n" + formatter.format(date));
		// Example-2
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println(new SimpleDateFormat("MMddyyy HHmmss").format(new Date()));

	}

}
