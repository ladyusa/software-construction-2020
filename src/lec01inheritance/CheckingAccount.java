package lec01inheritance;

public class CheckingAccount extends BankAccount {
    private int withdrawCount;

    private static final int LIMIT = 3;
    private static final int FEE = 10;

    public CheckingAccount() {}
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        withdrawCount++;

        double fee = 0;
        if (withdrawCount > LIMIT) {
            fee = FEE;
        }
        super.withdraw(amount + fee);
    }
}
