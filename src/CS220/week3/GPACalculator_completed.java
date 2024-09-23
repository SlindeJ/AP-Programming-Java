
import java.util.Scanner;

public class GPACalculator_completed {

	public static void main(String[] args) {
		// Step 1 - Get user input grade for each class
		// implementation: prompt user to enter grade for each class by using keyboard
		// create a Scanner class object to get user keyboard input
		// Use a while loop to allow user to enter grades for multiple classes
		Scanner keyboard = new Scanner(System.in); // create a new Scanner object for user keyboard input
		double honorPoints = 0;
		int units = 0;
		double totalHonorPoints = 0;
		int totalUnits = 0;

		// Step 2 - Determine Honor Points for each class
		// get total grade points and units for all classes
		while (true) {
			honorPoints = getHonorPoints(keyboard); // call getHonorPoints() method
			// honorPoints = getHonorPointsV2(keyboard);
			units = getUnits(keyboard);// call getUnits() method
			totalHonorPoints += honorPoints * units;
			totalUnits += units;
			// System.out.printf("Current honor points: %.2f\n", honorPoints);
			// System.out.println("Current units:" + units);
			// System.out.printf("Total honor points: %.2f\n", totalHonorPoints);
			// System.out.println("Total units: " + totalUnits);
			System.out.println("Press Y/y to continue adding more classes.");
			if (!keyboard.next().equalsIgnoreCase("Y")) {
				break;
			}
		}

		// Step 3 – Calculate GPA
		double GPA = calculateGPA(totalUnits, totalHonorPoints);

		// Step 4 - Output GPA
		System.out.println("Total honor points: " + totalHonorPoints);
		System.out.println("Total units: " + totalUnits);
		System.out.printf("GPA: %.2f", GPA);

	}

	/**
	 * calculateGPA accepts total grade points and total units to calculate and
	 * return GPA
	 * 
	 * @param totalUnits
	 * @param totalHonorPoints
	 * @return
	 */
	private static double calculateGPA(int totalUnits, double totalHonorPoints) {
		return totalUnits > 0 ? totalHonorPoints / totalUnits : 0;
		// return totalUnits > 0 ? totalUnits/totalHonorPoints : 0; //**Discussion:
		// formula error can only be discovered when testing your program
	}

	/**
	 * getUnits gets a valid user input units for a class and return it
	 * 
	 * @param keyboard: Scanner
	 * @return units: int
	 */
	private static int getUnits(Scanner keyboard) {
		int units = 3;
		while (true) { // keep looping if user did not enter valid input
			System.out.println("Enter the units for the class");
			units = keyboard.nextInt();
			if (units > 5 || units < 1)
				// if(units > 5 && units <1) //**Discussion: logical error can only be
				// discovered when testing your program
				System.out.println("Invalid input, try again! units must be an integer between 1 and 5.");
			else // valid input
				break;
		}

		return units;
	}

	/**
	 * getHonorPoints receives letter grade and convert it to honor points
	 * 
	 * @param keyboard: Scanner
	 * @return honorPoints: double
	 */
	private static double getHonorPoints(Scanner keyboard) {
		String grade = "";
		double honorPoints = -1;
		while (honorPoints < 0) { // keep asking user to enter a grade if the inputted grade is invalid
			System.out.println("Enter the grade for class");
			grade = keyboard.next();
			switch (grade.toUpperCase()) {
			case "A":
				honorPoints = 4.0;
				break;
			case "A-":
				honorPoints = 3.67;
				break;
			case "B+":
				honorPoints = 3.33;
				break;
			case "B":
				honorPoints = 3.0;
				break;
			case "B-":
				honorPoints = 2.67;
				break;
			case "C+":
				honorPoints = 2.33;
				break;
			case "C":
				honorPoints = 2.0;
				break;
			case "C-":
				honorPoints = 1.67;
				break;
			case "D+":
				honorPoints = 1.33;
				break;
			case "D":
				honorPoints = 1.0;
				break;
			case "D-":
				honorPoints = 0.67;
				break;
			case "F":
				honorPoints = 0;
				break;
			default:
				System.out.println("Invalid grade input, try again!");
				honorPoints = -1;
				// System.exit(0); //if we want to terminate the entire program
			}
		}
		return honorPoints;
	}

	/**
	 * getHonorPointsV2 shows an example of using array operator in switch statement
	 * array operator can be used when in each switch case a value is returned
	 * 
	 * @param keyboard: Scanner
	 * @return honorPoints: double
	 */
	private static double getHonorPointsV2(Scanner keyboard) {
		String grade = "";
		double honorPoints = -1;
		while (honorPoints < 0) {
			System.out.println("Enter the grade for class");
			grade = keyboard.next();
			honorPoints = switch (grade.toUpperCase()) { // version-2, switch statement with
			case "A" -> 4.0;
			case "A-" -> 3.67;
			case "B+" -> 3.33;
			case "B" -> 3.0;
			case "B-" -> 2.67;
			case "C+" -> 2.33;
			case "C" -> 2.0;
			case "C-" -> 1.67;
			case "D+" -> 1.33;
			case "D" -> 1.0;
			case "D-" -> 0.67;
			case "F" -> 0;
			default -> -1;
			};
			if (honorPoints < 0)
				System.out.println("Invalid grade input, try again!");
		}
		return honorPoints;
	}
}
