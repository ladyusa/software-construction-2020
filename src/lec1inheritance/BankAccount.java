package lec1inheritance;

/**
 * BankAccount class contains information about bank account.
 *
 * @author Usa Sammapun
 * @since 1.0
 * @version 1.0
 */
public class BankAccount {
   private double balance;

   /**
    * Default constructor assigning balance = 0
    */
   public BankAccount() {
      this(0);
   }

   /**
    * Constructor with initial balance
    *
    * @param initialBalance open account and deposit money too
    */
   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }

   /**
    * Deposit money into this account
    * @param amount money to be deposited
    */
   public void deposit(double amount) {
      balance = balance + amount;
   }

   /**
    * Withdraw
    * @param amount
    * @throws IllegalArgumentException
    */
   public void withdraw(double amount) {
      if (balance < amount)
         throw new IllegalArgumentException("Balance must be > amount");
      balance = balance - amount;
   }

   /**
    *
    * @return balance
    */
   public double getBalance() {
      return balance;
   }

}

