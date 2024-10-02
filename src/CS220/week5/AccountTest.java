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
		for (int i = 0; i < checkingAccounts.length; i++) {
			checkingAccounts[i] = new Account();
			System.out.println(checkingAccounts[i]);
		}
		// create an account array and provide account objects by calling constructor,
		// how many Account objects we assigned to this array will determine the size of the array
		Account[] checkingAccountsV2 = new Account[] {new Account(), new Account("Bob", 1000), new Account("Sam", 400) };
		//(5) call printAccounts() method to print out all checking accounts info.

				
		//(6) create an ArrayList of 10 saving accounts
				
				
		//(7) call printAccounts() method to print out all saving accounts info.
				
		
		
	}
	// private means printAccounts() is only used inside AccountTest
	public static void printAccounts() {

	}
}