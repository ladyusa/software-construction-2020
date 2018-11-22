package lec08junittesting.practice;

public class BankAccount {
    private double balance;
    private int numTransaction;

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
    public void withdraw(double amount) {
        double fee = 0;
        if (numTransaction > 5 && balance < 100000)
            fee = 10;

        balance = balance - amount - fee;
        numTransaction++;
    }

}
