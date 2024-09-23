

import java.util.Scanner;

public class Interest {
   public static void main(String[] args) {
	   //step-1: prepare for the user inputs and 
	   //program outputs
     
	  double principal = 1000; 	// initial amount before interest (p)
	  double rate = 0.035;      	//interest rate (r)
	  int compoundPeriods = 1; 	// compound periods (m)
      int years = 10; 			//total number of years (y) for the investment 
      
      Scanner keyboard = new Scanner (System.in);
	  System.out.println("Enter the principal in dollars: ");
      principal = keyboard.nextDouble(); 
      
      System.out.println("Enter the annual interest rate: ");
      rate = keyboard.nextDouble(); 

      System.out.println("Enter the compound periods: ");
      compoundPeriods = keyboard.nextInt();
      
      System.out.println("Enter the years of investment: ");
      years = keyboard.nextInt();
	  
      //calculate future value of the investment
      //call method displayFutureValue();
      //     
     
      // display headers
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");
      // calculate amount on deposit for each of ten years
      double amount = principal;
      for (int i = 1; i <= years; ++i) { 
    	  
         //version-1: calculate new amount on deposit for specified year  
    	 // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-
          //version-1: use Math.pow() method,
          System.out.printf("%4d%,20.2f%n", i, amount);   // display the year and the amount     
      } 
      // display headers
      System.out.printf("\n%s%20s%n", "Year", "Amount on deposit");
      amount = principal;
      for (int i = 1; i <= years*compoundPeriods; ++i) { 
          //version-2: calculate new amount on deposit   
     	 // without using Math.pow() method
 
       } 
   } 
   
   //Add definition of the displayFutureValue method here
   //displayFutureValue()
} 

