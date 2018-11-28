package lec11oodesign.atm.ver2bigjavabook.data;

import lec11oodesign.atm.ver2bigjavabook.model.Customer;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataSource {

    private String filename;

    /**
     * @param filename the name of the customer file
     */
    public DataSource(String filename) {
        this.filename = filename;
    }

    public DataSource() {
        this.filename = "data/customers.txt";
    }

    /**
     * Reads the customer numbers and pins
     * and initializes the bank accounts.
     */
    public Map<Integer, Customer> readCustomers() throws IOException {
        Map<Integer,Customer> customers = new HashMap<Integer,Customer>();

        Scanner in = new Scanner(new FileReader(filename));
        while (in.hasNext()) {
            int number = in.nextInt();
            int pin = in.nextInt();
            double currentBalance = in.nextDouble();
            Customer c = new Customer(number, pin, currentBalance);
            customers.put(c.getCustomerNumber(), c);
        }
        in.close();
        return customers;
    }
}
