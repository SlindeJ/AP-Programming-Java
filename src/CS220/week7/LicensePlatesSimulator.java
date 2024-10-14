
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class LicensePlatesSimulator {

	public static void main(String[] args) throws IOException{
		//write a Java application to generate 100 regular automobile license plates
		//by using random generator, and then save them to a text file (.txt) named
		//"license_plates".
	//step-1: create a Random object as a random number generator 
		
		
	//step-2: define a ArrayList of Strings to store licensePlates
	//call getRandomPlates() method to create that ArrayList	
	
		
	//output to a text file
		String filename = "license_plates.txt";
		
	//Step-3: Use PrintWriter and FileWriter objects to write random generated license plates to the output file	
		

		
		
	//Step-4: closes the PrintWriter and releases any system resources associated with the file output
	    
		
		System.out.println("Data is saved to " + (new File(filename)).getAbsolutePath()	);
	    
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
		char[] randomPart = new char[numR];
		for (int i=0; i<numR; i++) {
			randomPart[i] = (char)(rGenerator.nextInt(max-min+1)+min);
		}
		
		return new String(randomPart); 
	}
}
