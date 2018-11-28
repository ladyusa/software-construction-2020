package lec11oodesign.atm.ver1byeveryone;

import java.util.HashMap;
import java.util.List;

public class Bank {
    private HashMap<Integer,Customer> customers;

    public Bank() {
        customers = new HashMap<>();
    }

    public void addCustomers(List<Customer> customerList) {
        for (Customer c : customerList) {
            customers.put(c.getId(), c);
        }
    }

    public void transfer(int c1Id, int c2Id, double amount) {
        Customer c1 = customers.get(c1Id);
        Customer c2 = customers.get(c2Id);

        c1.withdraw(amount);
        c2.deposit(amount);
    }

    public void deposit(int id, double amount) {
        Customer c = customers.get(id);
        c.deposit(amount);
    }

    public void withdraw(int id, double amount) {
        Customer c = customers.get(id);
        c.withdraw(amount);
    }

    public double getBalance(int id) {
        Customer c = customers.get(id);
        return c.getBalance();
    }

    public boolean checkIdPin(int id, int pin) {
        for (Customer c : customers.values()) {
            if (c.getId() == id && c.getPin() == pin)
                return true;
        }
        return false;
    }
}
