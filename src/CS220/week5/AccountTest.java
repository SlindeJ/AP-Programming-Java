import CS220.week5.Account;

import java.util.ArrayList;
import java.util.Random;

//This class is used to create object instance and test the program Account.java

public class AccountTest{
	public static void main(String[] args) {
		
//when in the case that no constructor defined in a class, compiler will create a default constructor, 
//that default constructor will be called when creating object instances from that class.
		Account aa = new Account("aa", 300);
		System.out.println("Account name: " + (aa.getName().isEmpty()? "N/A": aa.getName()) );
		
//when in the case that at least one constructor defined in a class, then compiler will not create a default constructor,
//Those programmer-defined constructor(s) will be called when creating object instances from that class
		
		//(1) add code here to create an account object named "myAccount", 
		//and provide an account name (e.g., ask user to enter a name) and account balance
		Account myAccount = new Account("Tina", 500);
		//(2) display myAccount's name and balance 
		System.out.println(myAccount);	// it will call .toString() in the class by default
				
		//(3) deposit $500 to myAccount.
		myAccount.deposit(500);
				
		//(4) create an array of three checking accounts
		Account[] checkingAccounts = new Account[3];
//		for (int i = 0; i < checkingAccounts.length; i++) {
//			checkingAccounts[i] = new Account();
//			System.out.println(checkingAccounts[i]);
//		}
		checkingAccounts[0] = new Account("sss", 500);
		checkingAccounts[1] = new Account("aaa", 500);
		checkingAccounts[2] = new Account("bbb", 500);
		printAccounts(checkingAccounts, "Checking Account");
		// create an account array and provide account objects by calling constructor,
		// how many Account objects we assigned to this array will determine the size of the array
		Account[] checkingAccountsV2 = new Account[] {new Account(), new Account("Bob", 1000), new Account("Sam", 400) };
		printAccounts(checkingAccountsV2, "Checking Account");
		//(5) call printAccounts() method to print out all checking accounts info.

				
		//(6) create an ArrayList of 10 saving accounts
		ArrayList<Account> savingAccounts = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			savingAccounts.add(new Account());
		}
		//(7) call printAccounts() method to print out all saving accounts info.
		Account[] savingListToArray = new Account[savingAccounts.size()];
		savingListToArray = savingAccounts.toArray(savingListToArray);
		// convert ArrayList to be array and then print them out by calling printAccounts()
		printAccounts(savingListToArray, "Saving Account");
		
		
	}
	// private means printAccounts() is only used inside AccountTest
	public static void printAccounts(Account[] checkingAccountsV2, String type) {
		System.out.println("Print " + type + " :");
		for (Account c : checkingAccountsV2 ) {
			System.out.println(c);
		}
	}
}