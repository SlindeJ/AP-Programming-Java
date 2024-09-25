
/**
 * shows examples of number literal starts with 0 or 0x
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] test; // declare an array variable

		char[] charArray = null;
		System.out.println(Arrays.toString(charArray));
		int size = 6;
		double[] prices = new double[size]; // declare an array variable and assign a new array object
		// and use default values to initialize the data members in that array
		size = 7;

		int[] intArray = { 4, 5, 89, 1, 8, 10 };
		int[] array2 = intArray;
		System.out.println(intArray); // return the hash code of the object that intArray variable references
		System.out.println(array2); // return the hash code of the object that array2 variable references
		System.out.println(intArray == array2); // return true because both array variables reference to the same array
												// object

		// create a new array with the elements from an existing array
		array2 = Arrays.copyOf(intArray, intArray.length);
		System.out.println(array2);
		System.out.println(intArray == array2);
		// System is a final class in java.lang package, arrayCopy() a method from System class
		// copy elements from one existing array to another existing array
		int[] array3 = new int[10];
		System.out.println(Arrays.toString(array3));
		System.arraycopy(intArray, 0, array3, 0, intArray.length);
		System.out.println(array3);
		System.out.println(intArray == array3);
		System.out.println(Arrays.toString(array3));

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = input.nextLine();
		//String text = "";
		if (!text.isEmpty()) {
			String[] words = text.split("\\s+");
			System.out.println(words.length); // the length property tells the size of an array
			System.out.println(words.length == 0); // if the length is 0, means empty array
		}

		System.out.println("-".repeat(23));
		System.out.printf("|%10s|%10s|%n", "Quantity", "Price");
		System.out.println("-".repeat(23));
		System.out.printf("|%10d|%10.2f|%n", 1, 1 * 23.4);
		System.out.println("-".repeat(23));
		System.out.printf("|%-10s|%-10s|%n", "Quantity", "Price");
		System.out.println("-".repeat(23));
		System.out.printf("|%-10d|%-10.2f|%n", 1, 1 * 23.4);

		input.close();

		int[][] twoDarrayV1 = null;

		int[][] twoDarrayV2 = new int[5][4];	// create new 2d array with 5 rows and 4 columns
		System.out.println(Arrays.deepToString(twoDarrayV2));
		// print out the hash code in each dimention
		for (int[] ele : twoDarrayV2) {
			System.out.println(Arrays.toString(ele));
		}
		int[][] twoDarrayV3 = new int[3][];		// create new 2d array with 3 rows and decide columns later
		twoDarrayV3[0] = new int[10];
		twoDarrayV3[1] = new int[5];
		twoDarrayV3[2] = new int[1];

		int[][] twoDarrayV4 = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9, 10 } };
		for (int[] ele : twoDarrayV4) {
			System.out.println(Arrays.toString(ele));
		}
		// replace element with given index in 2D array
		String index = "1-2"; // means row 1 and column 2

	}

}
