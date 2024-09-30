//import java.util.ArrayList;
//import java.util.Random;

//This class is used to create object instance and test the program Account.java

public class AccountTest{
	public static void main(String[] args) {
		
//when in the case that no constructor defined in a class, compiler will create a default constructor, 
//that default constructor will be called when creating object instances from that class.
		Account aa = new Account();
		System.out.println("Account name: " + (aa.getName().isEmpty()? "N/A": aa.getName()) );
		
//when in the case that at least one constructor defined in a class, then compiler will not create a default constructor,
//Those programmer-defined constructor(s) will be called when creating object instances from that class
		
		//(1) add code here to create an account object named "myAccount", 
		//and provide an account name (e.g., ask user to enter a name) and account balance
				
		//(2) display myAccount's name and balance 
				
				
		//(3) deposit $500 to myAccount.
				
				
		//(4) create an array of three checking accounts
				
			
		//(5) call printAccounts() method to print out all checking accounts info.
				
				
		//(6) create an ArrayList of 10 saving accounts
				
				
		//(7) call printAccounts() method to print out all saving accounts info.
				
		
		
	}

}