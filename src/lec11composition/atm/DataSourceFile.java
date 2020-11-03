package lec11composition.atm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataSourceFile {

    public Map<Integer, Customer> readCustomers() {

        HashMap<Integer, Customer> customers = new HashMap<>();

        FileReader reader = null;
        try {
            reader = new FileReader("data/customers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader buffer = new BufferedReader(reader);

        String line = null;
        while (true) {
            try {
                if (!((line = buffer.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] data = line.split(",");
            int id = Integer.parseInt(data[0]);
            int pin = Integer.parseInt(data[1]);
            String name = data[2];
            double balance = Double.parseDouble(data[3]);
            Customer c = new Customer(id,pin,name,balance);
            customers.put(c.getId(), c);
        }
        return customers;
    }

}
