// LetterGrades.java
// LetterGrades class uses the switch statement to count letter grades.

import java.util.Scanner;

public class LetterGrades {
	public static void main(String[] args) {
		int total = 0; // sum of grades
		int gradeCounter = 0; // number of grades entered
		int aCount = 0; // count of A grades
		int bCount = 0; // count of B grades
		int cCount = 0; // count of C grades
		int dCount = 0; // count of D grades
		int fCount = 0; // count of F grades

		Scanner input = new Scanner(System.in);

		System.out.println("Enter grades, separate them by whitespace, enter -1 to quit");
//use hasNext() method to double check if there is any data (default: split data by whitespace) left in the keyboard input stream
		// use a while loop
		while (input.hasNext()) {
			int grade = input.nextInt(); // get user input grade one by one
			if (grade < 0) { // end of the input
				break;
			}
			// get total grade and count number of grades
			gradeCounter++;
			total = total + grade;
			// decide the letter grade for each numerical grade
			switch (grade/10) {
				case 9, 10 -> ++aCount;
				case 8 -> ++bCount;
				case 7 -> ++cCount;
				case 6 -> ++dCount;
				default -> ++fCount;
			}
		}
		input.close();
		// display grade report
		System.out.printf("%nGrade Report:%n");

		// if user entered at least one grade...
		if (gradeCounter > 0) {
			// calculate average of all grades entered
			double average = (double) total / gradeCounter;

			// output summary of results
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f out of 100", average);
			System.out.printf("%n%s%n%s%d%s%n%s%d%s%n%s%d%s%n%s%d%s%n%s%d%s%n",
					"Number of students who received each grade:", "Grade A: ", aCount, "*".repeat(aCount), // display
																											// number of
																											// A grades
					"Grade B: ", bCount, "*".repeat(bCount), // display number of B grades
					"Grade C: ", cCount, "*".repeat(cCount), // display number of C grades
					"Grade D: ", dCount, "*".repeat(dCount), // display number of D grades
					"Grade F: ", fCount, "*".repeat(fCount)); // display number of F grades
		} else { // no grades were entered, so output appropriate message
			System.out.println("No grades were entered");
		}

	}
}
