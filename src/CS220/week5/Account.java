package CS220.week5;// Version-1: Account.java
// Account class that contains an name instance variable 
// and methods to set and get its value.

import java.text.DecimalFormat;

public class Account {
   private String name; // instance variable
   private double balance;
   //add instance variable (or property or attribute): balance
   
   
   //add a constructor, to provide customized initialization for a new account name and balance
   // same name as the class name and no return type, and most of the time, public
   public Account(String name, double balance) {
      this.name = name;
      this.balance = balance;
   }
   // add constructor without parameter
   public Account() { // this serves as default constructor
      //this.name = "N/A";
      //this.balance = 0.0;
      // or
      this("N/A", 0.0); // call constructor with two parameters
   }
   //add method: deposit() //i.e., set balance, instead of giving setBalance as the method name, "deposit" is a more proper name 
   public void deposit(double amount) {
      if (amount > 0) {
         this.balance += amount;
      }
   }
   //add method: getBalance() //i.e., get balance
   public double getBalance() {
      return this.balance;
   }
   
   // method to set the name in the object              
   public void setName(String name) { 
      this.name = name; // store the name
   }         
   
   
   // method to retrieve the name from the object
   public String getName() {
      return name; // return value of name to caller        
   }   
   
   // add method: toString()  //This is a common practice to convert account information into a string, which makes easy to print out account info.
   public String toString() {
      DecimalFormat moneyFormat = new DecimalFormat("$###,###.00");
      String accountInfo = String.format("%-10s%s", name, moneyFormat.format(balance));
	   return accountInfo;
   }
   
}

