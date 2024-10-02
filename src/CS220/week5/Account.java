// Version-1: Account.java
// Account class that contains an name instance variable 
// and methods to set and get its value.

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
   
   //add method: deposit() //i.e., set balance, instead of giving setBalance as the method name, "deposit" is a more proper name 
   
   //add method: getBalance() //i.e., get balance
   
   
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
	  
	   return "";
   }
   
}

