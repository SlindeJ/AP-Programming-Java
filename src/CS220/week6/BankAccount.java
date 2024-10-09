package CS220.week6;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   private int transactionCount;          // count of transactions
   private double transactionFee;

   private void countTransaction() {      // class method to increment transactionCount
      transactionCount++;
      if (transactionCount > 5) {   // implements a fee call method if transaction would occur a fee
         addFee();
      }
   }
   private void addFee() {
      transactionFee++; // doing fee things
      balance--;
   }
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into this account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
      countTransaction();
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {   
      final double PENALTY = 10;
      if (amount > balance)
      {
         balance = balance - PENALTY;
      }
      else
      {
         balance = balance - amount;
      }
      countTransaction();
   }

   /**
      Adds interest to this account.
      @param rate the interest rate in percent
   */
   public void addInterest(double rate)
   {   
      double amount = balance * rate / 100;
      balance = balance + amount;
   }

   /**
      Gets the current balance of this account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
   public int getTransactionCount() { return transactionCount; }
   public double getTransactionFee() { return transactionFee; }
}

