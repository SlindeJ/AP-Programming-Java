package CS220.week6;

/**
   This program tests the BankAccount class.
*/

public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysAccount = new BankAccount(1000);
      System.out.println("Test case 1:");
      harrysAccount.deposit(500); // Balance is now $1500
      harrysAccount.withdraw(2000); // Balance is now $1490
      harrysAccount.addInterest(1); // Balance is now $1490 + 14.90
      System.out.printf("%.2f%n", harrysAccount.getBalance());
      System.out.println("Expected: 1504.90");
      System.out.println("Number of transactions so far: " + harrysAccount.getTransactionCount());
      System.out.println("Expected: 2");
      System.out.println("Transaction fees occured so far: $" + harrysAccount.getTransactionFee());
      System.out.println("Expected: $0.00");
      //
      harrysAccount.deposit(500);
      harrysAccount.deposit(500);
      harrysAccount.deposit(500);
      harrysAccount.deposit(500);
      harrysAccount.deposit(500);
      harrysAccount.deposit(500);
      harrysAccount.deposit(500); // 7 transactions worth $3500
      System.out.println("Test case 2:");
      System.out.printf("%.2f%n", harrysAccount.getBalance());
      System.out.println("Expected: " + (1504.9 + 3500-4));
      System.out.println("Number of transactions so far: " + harrysAccount.getTransactionCount());
      System.out.println("Expected: 9");
      System.out.println("Transaction fees occured so far: $" + harrysAccount.getTransactionFee());
      System.out.println("Expected: $4.00");
   }
}


