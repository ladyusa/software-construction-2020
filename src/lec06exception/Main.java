package lec06exception;


public class Main {
    public static void main(String[] args) {
        BankAccount act = new BankAccount(1000);
        try {
            act.withdraw(1000000);
        } catch (InsufficientFundException e) {
            System.err.println("Sorry. "+e.getMessage());
        }

    }
}
