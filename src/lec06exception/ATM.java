package lec06exception;

public class ATM {

    public void transfer(BankAccount source, BankAccount destination, double amount) throws InsufficientFundException {

        // -----------------------------------------------
        // this class is not GUI and does not know how to
        // tell a user if he/she withdraws more than he/she has
        // therefore, it throws exception to code that calls
        // method transfer
        // -----------------------------------------------
        source.withdraw(amount);
        destination.deposit(amount);
    }
}
