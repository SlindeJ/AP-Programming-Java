package CS220.week3;

import java.util.Scanner;

public class IntegerDivision_GiveChange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Note convert input to pennies to avoid roundoff errors in using doubles
		System.out.print("Enter amount due: ");
		double amountDueInput = in.nextDouble();
		int amountDue = (int) Math.round(amountDueInput * 100);
		System.out.println("Amount due (in dollars): " + amountDueInput);
		System.out.println("Amount due (in cents): " + amountDue);

		System.out.print("Enter amount received: ");
		double amountReceivedInput = in.nextDouble();
		int amountReceived = (int) Math.round(amountReceivedInput * 100);
		System.out.println("Amount received (in dollars): " + amountReceivedInput);
		System.out.println("Amount received (in cents): " + amountReceived);

		System.out.printf("Total change: %d cents.\n",
				(amountReceived - amountDue < 0) ? 0 : amountReceived - amountDue);
		int changeLeftInPennies = (amountReceived - amountDue < 0) ? 0 : amountReceived - amountDue;

		int dollars = changeLeftInPennies / 100;
		changeLeftInPennies = changeLeftInPennies % 100;
		int quarters = changeLeftInPennies / 25;

		changeLeftInPennies %= 25;
		int dimes = changeLeftInPennies / 10;

		changeLeftInPennies %= 10;
		int nickels = changeLeftInPennies / 5;

		changeLeftInPennies %= 5;
		int pennies = changeLeftInPennies;

		System.out.println("Give the following change: ");
		System.out.printf("Dollars %d\n", dollars);
		System.out.printf("Quarters %d\n", quarters);
		System.out.printf("Dimes %d\n", dimes);
		System.out.printf("Nickels %d\n", nickels);
		System.out.printf("Pennies %d\n", pennies);

		in.close();
	}
}
