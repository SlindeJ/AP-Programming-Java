package CS220.week7LAB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class PhoneBookTest {

	public static void main(String[] args) throws IOException{
		//Create a PhoneBook object instance
		PhoneBook b = new PhoneBook();
		
		//Get file name from user input 
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				String fileName = input.next();
				File file = new File(fileName);
				Scanner inputFile = new Scanner(file);
				while (inputFile.hasNextLine()) {
					String[] i = inputFile.nextLine().split(",");
					String lastName = i[0];
					String firstName = i[1];
					String phoneNumber = i[2];
					b.addPhone(firstName, lastName, phoneNumber);
				}
				break;
			} catch (FileNotFoundException e) {
				System.out.println("Cannot find the sample data file! Try again!");
			} catch (Exception e) {
				System.out.println("System Error!");
			}
		}
        //read in data from the file
        //print names and phone numbers from phone list of the PhoneBook object
		b.print();
        //prompt user to enter a person's name or the first few characters of a name
		System.out.println("Please enter a key to search for: ");
		String key = input.next();
        //search phone book to find resident names and phone numbers
		b.searchPhone(key);
	}
}
