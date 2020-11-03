package lec11composition.atm;

public class ATM {
    private Bank bank;
    private Customer loginCustomer;

    public ATM(Bank bank) {
        this.bank = bank;
        this.loginCustomer = null;
    }

    public String validateCustomer(int id, int pin) {
        Customer customer = bank.findCustomer(id);

        if (customer != null && customer.checkPin(pin)) {
            loginCustomer = customer;
            return customer.getName();
        }
        return null;
    }

    public void deposit(double amount) {
        // delegation
        loginCustomer.getAccount().deposit(amount);
    }

    public void withdraw(double amount) {
        // delegation
        loginCustomer.getAccount().withdraw(amount);
    }

    public double getBalance() {
        return loginCustomer.getAccount().getBalance();
    }

    public void transfer(int receiverId, double amount) {
        Customer receiver = bank.findCustomer(receiverId);
        if (receiver != null) {
            loginCustomer.getAccount().withdraw(amount);
            receiver.getAccount().deposit(amount);
        }
    }

    public void end() {
        loginCustomer = null;
    }
}
