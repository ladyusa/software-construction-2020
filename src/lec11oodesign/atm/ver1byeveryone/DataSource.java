package lec11oodesign.atm.ver1byeveryone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class DataSource {

    private String filename;

    public DataSource(String filename) {
        this.filename = filename;
    }

    public DataSource() {
        this.filename = "data/customers.txt";
    }

    public List<Customer> readCustomers() throws FileNotFoundException {
        List<Customer> customers = new ArrayList<>();

        Scanner in = new Scanner(new File(filename));
        while (in.hasNext()) {
            int number = in.nextInt();
            int pin = in.nextInt();
            double currentBalance = in.nextDouble();
            Customer c = new Customer(number, pin, currentBalance);
            customers.add(c);
        }
        in.close();
        return customers;
    }
}
