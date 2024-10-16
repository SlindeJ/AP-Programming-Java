package CS220.week7;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class LicensePlatesSimulator {

	public static void main(String[] args) throws IOException{
		//write a Java application to generate 100 regular automobile license plates
		//by using random generator, and then save them to a text file (.txt) named
		//"license_plates".
	//step-1: create a Random object as a random number generator 
		Random rGenerator = new Random();
		
	//step-2: define a ArrayList of Strings to store licensePlates
	//call getRandomPlates() method to create that ArrayList
		ArrayList<String> plates = getRandomPlates(rGenerator, 100);
		String p1 = "", p2 = "";
		
	//output to a text file
		String filename = "license_plates.txt";
		
	//Step-3: Use PrintWriter and FileWriter objects to write random generated license plates to the output file
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(new FileWriter(filename, false));

		for (String p : plates) {
			pw.println(p);
		}
	//Step-4: closes the PrintWriter and releases any system resources associated with the file output
		pw.close();
		System.out.println("Data is saved to " + (new File(filename)).getAbsolutePath()	);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		PrintWriter apper = new PrintWriter(new FileWriter(filename, true));		// appender
		ArrayList<String> fifty = getRandomPlates(rGenerator, 50);	// 50 new plates
		for (String p : fifty) {
			apper.println(p); 		// for all 50 plates add each plate to file
		}
		Scanner readFile = new Scanner(new FileReader(filename));
		try {		// printing everything in file
			while (readFile.hasNextLine()) {
				p1 = readFile.nextLine();
				System.out.println(p1);
			}
		}
		catch (Exception e) {
			System.out.println("File not found!");
		}
		apper.close();
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	}
	/**
	 * getRandomPlates: generate license plate numbers by using random number generator
	 * @param rGenerator
	 * @param numR
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> getRandomPlates(Random rGenerator, int numR){
		ArrayList<String> plates = new ArrayList<String>();
		String p1 = "", p2="";
		
	//Step-5: add a for loop to generate part-1 and part-2 of the license plates
		//call getRandom() method to get part-1 and part-2 string
		for (int i = 0; i < numR; i++) {
			p1 =getRandom(rGenerator, (int)'A', (int)'Z', 3);		// alternatively a = 65 and z = 90
			p2 = getRandom(rGenerator, 48, 57, 4);
			plates.add(p1 + "-" + p2);
		}
		return plates;
	}

	/**
	 * getRandom: generate a sequence of random integer numbers and convert them to characters 
	 * @param rGenerator
	 * @param min
	 * @param max
	 * @param numR
	 * @return String
	 */
	public static String getRandom(Random rGenerator, int min, int max, int numR) {
		char random;
		String randomPart = "";
		for (int i = 0; i < numR; i++) {
			random = (char)(rGenerator.nextInt((max - min) + 1) + min);
			randomPart += random;
		}
		return randomPart;
	}
}
