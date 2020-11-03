package lec11composition.atm;

import java.util.Map;

public class Bank {
    private String name;    // attribute
    private Map<Integer, Customer> customers;   // composition
    private DataSourceFile dataSource;     // composition

    public Bank(String name) {
        this.name = name;
        this.dataSource = new DataSourceFile();
        this.customers = dataSource.readCustomers();
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer findCustomer(int id) {
        return customers.get(id);
    }
}
