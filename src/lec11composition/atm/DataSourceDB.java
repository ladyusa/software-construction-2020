package lec11composition.atm;

import java.util.HashMap;
import java.util.Map;

public class DataSourceDB {

    public Map<Integer, Customer> readCustomers() {

        // read from database

        HashMap<Integer, Customer> customers = new HashMap<>();

        Customer peter = new Customer(1, 1234, "ปีเตอร์", 1000);
        Customer kat = new Customer(2, 2345, "แคทเทอรีน", 2000);
        Customer nancy = new Customer(3, 3456, "แนนซี่", 3000);

        customers.put(1, peter);
        customers.put(2, kat);
        customers.put(3, nancy);

        return customers;
    }
}
