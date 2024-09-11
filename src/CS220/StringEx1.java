import java.util.Scanner;

//Note-1: main method must be defined in a class
//Note-2: the class contains the main method should have the same name as the file name
public class StringEx1 {

	public static void main(String[] args) {
		// about using Strings
		String a = "school"; // String variable a reference a String literal object "school"
		String b = "school"; // String variables b and a reference to the same String objects
		String bv2 = new String("school");

		// How to compare two strings? == operator vs. equals() method

		// what will be the outputs from the following statements?
		System.out.println("a==b? " + (a == b));
		System.out.println("a==bv2? " + (a == bv2));

		System.out.println("a.equals(b)? " + (a.equals(b)));
		System.out.println("a.equals(bv2)? " + (a.equals(bv2)));

		String c = "SCHOOL";
		String d = new String("School");
		// what will be the outputs from the following statements?
		System.out.println("c.equals(d)? " + (c.equals(d)));
		System.out.println("c.equalsIgnoreCase(d)? " + (c.equalsIgnoreCase(d)));

		/**
		 * Note: "==", the equal to operator compares the references of string objects,
		 * NOT string content!
		 */

		// String object is immutable, what is the following statement doing?
		c = c + b; // string contents are combined and a new String object is created to store
					// combined string content and
		// then the String variable c now reference to that new String object
		System.out.println(c);

		// use Scanner object to read in user inputs from keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter your age: ");
		int age = input.nextInt(); // the enter key that user clicked on the keyboard
		// when they finish entering the
		// age will add a line break character into the input stream

		// String age = input.next(); // here use input.next() will cause the same issue
		System.out.println("Your age is: " + age);

		System.out.println("Enter your name: ");
		String name = input.nextLine(); // any run-time error here?
		// Scanner object's nextLine() method will read in all characters
		// entered/existing in the input stream including \n line break character
		System.out.println("Your name is: " + name);
		System.out.println("Your name is: " + (name.isEmpty() ? name.length() : name.strip()));

		// solution-v2: read in all user inputs as string and then convert strings to
		// other types of data that we want
		System.out.println("\nEnter your age: ");
		int ageV2 = Integer.parseInt(input.nextLine().strip()); // convert String to
		// integer by using methods from
		// wrapper class: Integer
		System.out.println("Your ageV2 is: " + ageV2);
		System.out.println("Your ageV2 is: " + Integer.toString(ageV2)); // convert
		// an integer to a String
		System.out.println("Enter your nameV2: ");
		String nameV2 = input.nextLine();
		System.out.println("Your name is: " + nameV2);

		// When we use nextLine() or next() to read in string,
		// these methods will always check the input stream first,
		// if there is anything left in the input stream, the nextLine() method will
		// take them automatically instead of pausing the execution of the program
		// to wait for new inputs from user. This will cause problem here.
		// To solve this problem, just add a line of code to check

		// if (input.hasNextLine()) input.nextLine(); //which will take the leftover,
		// and allow user input when asking for name by call nextLine() method again

		input.close();

	}
}
