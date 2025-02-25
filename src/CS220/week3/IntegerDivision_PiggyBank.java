package CS220.week3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IntegerDivision_PiggyBank {

	public static void main(String[] args) {
		// Step-1: Get user inputs: num of quarters, nickels, dimes, pennies
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of quarters, nickels, dimes, and pennies in your piggybank.");
		int quarters = keyboard.nextInt();
		int nickels = keyboard.nextInt();
		int dimes = keyboard.nextInt();
		int pennies = keyboard.nextInt();

		if (quarters < 0 || nickels < 0 || dimes < 0 || pennies < 0) {
			System.out.println("Invalid input! All inputs should be non-negative integer numbers.");
			keyboard.close();
			System.exit(1);
		}

		// Step-2: Convert coins to number of total cents
		final int QUARTER = 25;
		final int NICKEL = 5;
		final int DIME = 10;

		// (1) add code here
		int totalCents = quarters * QUARTER + nickels * NICKEL + dimes * DIME + pennies;
		// Step-3: Convert number of total cents to total dollar amount
		// (2) add code here
		int totalDollars = totalCents / 100;
		int leftCents = totalCents % 100;

		String moneyAmount = Integer.toString(totalDollars) + "." + Integer.toString(leftCents); //combining total dollars and total cents to create a
		// string money format
		System.out.println("Total money amount: $" + moneyAmount);

		// create money format (version-2): use DecimalFormat
		double totalAmountInDollars = Double.parseDouble(moneyAmount);
		DecimalFormat moneyFormat = new DecimalFormat("$###,##0.00"); //use 0 here to
		// make sure always show 0.00 if needed.
		System.out.printf("Total money amount: %s\n",
		moneyFormat.format(totalAmountInDollars));
		keyboard.close(); // always close the Scanner object at the end when we do not need to use it
					// get user input

		// call convertV2 method
		convertV2(quarters, nickels, dimes, pennies);
	}
	// convert_version2: (3) add code to complete this method
	public static void convertV2(int q, int n, int d, int p) {
		// use counting technique, convert input quarters, nickels, dimes, and pennies
		// to dollar amount first
		// and then convert anything left to cents.
		int totalDollars = q/4 + n/20 + d/10 + p/100;
		int leftCents = q%4 * 4 + n%20 * 5 + d%10 * 10 + p%100;
		totalDollars += leftCents / 100;
		leftCents %= 100;
		System.out.println("Total money amount: $" + Integer.toString(totalDollars) + "." + Integer.toString(leftCents));

	}
}
