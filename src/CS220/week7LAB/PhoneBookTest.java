package CS220.week7LAB;

import java.io.*;
import java.util.*;

public class PhoneBookTest {

	public static void main(String[] args) throws IOException{
		//Create a PhoneBook object instance
		PhoneBook b = new PhoneBook();
		
		//Get file name from user input 
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Filename:");
				String fileName = input.next();
				BufferedReader br = new BufferedReader(new FileReader("src/CS220/week7LAB/" + fileName));
				String st;
				while ((st = br.readLine()) != null) {
					//st = br.readLine();
					String[] i = st.split(",");
					String lastName = i[0];
					String firstName = i[1];
					String phoneNumber = i[2];
					b.addPhone(firstName, lastName, phoneNumber);
				}
				br.close();
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
		System.out.print("Please enter a key to search for: ");
		String key = input.next();
        //search phone book to find resident names and phone numbers
		ArrayList<ResidentPhone> a = b.searchPhone(key);
		if (a.isEmpty()) {
			System.out.println("Did not find customer name that starts with " + key);
		} else {
			for (ResidentPhone r : a) {
				System.out.println(r);
			}
		}

	}
}
