//Letter Grades using arrays example

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class LetterGradesArrayList {
	final static int[] test1 = { 100, 78, 90, 60, 54, 77, 20, 0, 87 }; // for testing
	final static Integer[] test2 = { 100, 78, 90, 60, 54, 77, 20, 0, 87 };

	public static void main(String[] args) {

		// Step-1: create ArrayList to get all test scores from test1
		ArrayList<Integer> gradesArray1 = new ArrayList<>();
		for (int score : test1) {
			gradesArray1.add(score);	// those data will be wrapped as integer objects and then stored
		}
		System.out.println(gradesArray1);	// print out ArrayList, by calling toString method from ArrayList (calls automatically)

		// Step-2: create ArrayList to get all test scores from test2
		ArrayList<Integer> gradesArray2 = new ArrayList<>(Arrays.asList(test2));
		System.out.println(gradesArray2);

		// Step-3: use ArrayList to get all input scores: getInputGrades()
		ArrayList<Integer> gradesArray = getInputGrades();
		// check if gradesArray is empty, then
		// print out an error message "no grades entered!" and exit the entire program

		// print out grades array
		System.out.println(gradesArray);

		// Step-3: define countGrades array by calling getGradesCount() method to create
		// grade counters
		final char[] letterGrade = { 'A', 'B', 'C', 'D', 'F' };
		int[] countGrades = getGradesCount(gradesArray, letterGrade); // provide arguments

		// Step-4: display grade report by calling displayReport() method
		displayReport(gradesArray, letterGrade, countGrades); // add arguments in method call

	} // end of the main method

	/**
	 * getInputGrades: to get user input numerical grades
	 * 
	 * @return int[] a numerical grade array
	 */
	public static ArrayList<Integer> getInputGrades() {
		Scanner input = new Scanner(System.in);

		// step-1.1: define a scoreArray
		ArrayList<Integer> scoreArray = new ArrayList<Integer>();
		System.out.println("Enter grades, separate them by whitespace");

		// step-1.2: define a loop to read grade
		// if input grade is not in the range 0-100, print out error message "invalid
		// input!"
		// and then exit the entire program
		// otherwise, add input grade to scoreArray
		String userInput = input.nextLine();
		Scanner reader = null;	// create another Scanner object
		if (!userInput.isEmpty()) {
			reader = new Scanner(userInput);
			while (reader.hasNext()) {		// use a loop to scanner each token in the string
				int grade = reader.nextInt();
				if (grade < 0 || grade > 100) {
					System.out.println("invalid input!" + grade);
					System.exit(1);
				} else {
					scoreArray.add(grade);
				}
			}
		} else
			System.out.println("Invalid input");
		// step 1.3: return scoreArray
		if (reader != null)
			reader.close();				// close Scanner reader, release system resource

		return scoreArray;
	}

	/**
	 * getGradesCount: to count grades in each grade range: A (90-100), B (80-89), C
	 * (70-79), D (60-69), F (<60)
	 * 
	 * @param gradesArray
	 * @param letterGrade
	 * @return
	 */
	public static int[] getGradesCount(ArrayList<Integer> gradesArray, char[] letterGrade) {
		// define a grade counter array: countGrades
		int[] countGrades = new int[letterGrade.length];

		// define a loop to count each numerical grade based on its equivalent letter
		// grade
		if (!gradesArray.isEmpty()) {
			for (int grade : gradesArray) {
				// increment appropriate letter-grade counter
				switch (grade / 10) {
				case 9, 10 -> ++countGrades[0];
				case 8 -> ++countGrades[1];
				case 7 -> ++countGrades[2];
				case 6 -> ++countGrades[3];
				default -> ++countGrades[4];
				} // end of switch-case
			}
		}
		// return countGrades array
		return countGrades;

	}

	/**
	 * displayReport: print out: total and average grade, and grades distribution
	 * 
	 * @param gradesArray
	 * @param letterGrade
	 * @param countGrades
	 */
	public static void displayReport(ArrayList<Integer> gradesArray, char[] letterGrade, int[] countGrades) {
		System.out.printf("%nGrade Report:%n");
		// calculate average of all grades entered
		int total = 0;
		if (!gradesArray.isEmpty()) {
			for (int grade : gradesArray) {
				total += grade;
			}
		}
		double average = (double) total / gradesArray.size();

		// output summary of results
		System.out.printf("Total of the %d grades entered is %d%n", gradesArray.size(), total);
		System.out.printf("Class average is %.2f%n", average);
		System.out.println("Number of students who received each grade:");

		for (int i = 0; i < letterGrade.length; i++) {
			System.out.printf("%s: %d %s%n", "Grade " + letterGrade[i], countGrades[i], "*".repeat(countGrades[i]));
		}
	}

}
