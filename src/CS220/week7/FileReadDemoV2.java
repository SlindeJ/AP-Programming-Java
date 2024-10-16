package CS220.week7;
//means import everything from java.io package
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; //program uses class Scanner
/*This is an example of using FileReader, BufferedReader to get input data line by line from a text-based file 
*Note that: Using BufferedReader and readLine() is a fast and efficient way to read files in Java.
*It is especially useful when you need to read large files as it buffers the input, reducing the I/O operations.
*Disadvantage: must handle IOException because each of its' methods may throw IOException
*https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedReader.html
*
*/

public class FileReadDemoV2 {
	public static void main(String[] args) { // without using throws IOException

		// Create a Scanner object for input file name
		Scanner keyboard = new Scanner(System.in);
		BufferedReader br = null;
		File newFile = null;
		String st = "";
		String[] personInfo = { "Name", "Phone", "Address", "Zip Code" };
		ArrayList<String[]> personInfo2 = new ArrayList<String[]>();

		while (true) { // use a loop and try-catch block to handle FileNotFoundException
			// Get the file name
			System.out.print("Enter the filename: ");
			String filename = keyboard.nextLine();
			newFile = new File(filename);

			try {
				br = new BufferedReader(new FileReader(filename)); // use file name string
				break; // get valid file name and set up BufferedReader
			} catch (FileNotFoundException e) {
				System.out.println("File not found. Press q to quit, otherwise, continue.");
				if (keyboard.nextLine().equalsIgnoreCase("Q"))
					System.exit(0);
			} // end of catch block

		} // end of while loop
		try {
			while ((st = br.readLine()) != null) {
				String[] token = st.split(",");

				System.out.println("\ndata line read in: " + st);
				personInfo2.add(token);
				for (int i = 0; i < token.length; i++)
					System.out.println(personInfo[i] + ": " + token[i]);

			}

			System.out.printf("%-10s\t%-10s\t%-30s\t%-10s\n", "Name", "Phone", "Address", "Zip Code");
			for (String[] s : personInfo2) {
				System.out.printf("%-10s\t%-10s\t%-30s\t%-10s\n", s[0], s[1], s[2], s[3]);
			}

			if (br != null)
				br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nData read from the file:" + newFile.getAbsolutePath());
	} // end of main

}// end of class
