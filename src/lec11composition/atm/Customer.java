package lec11composition.atm;

public class Customer {
    // attribute, field
    private int id;
    private int pin;
    private String name;

    // composition
    private BankAccount account;

    public Customer(int id, int pin, String name) {
        this(id, pin, name, 0);
    }

    public Customer(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.account = new BankAccount(id, name, balance);
    }

    public boolean checkPin(int inputPin) {
        return pin == inputPin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}
