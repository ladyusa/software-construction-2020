package lec08junittesting.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // cascading constructor
    public BankAccount() {
        this(0);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundException {
        if (balance < amount)
            throw new InsufficientFundException("Amount must be less than balance");
        this.balance -= amount;
    }

}
