package lec09strategypattern.store.withstrategypattern;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, String type, double price, int qty) {
        products.add(new Product(name, type, price, qty));
    }

    public int countProduct(CounterStrategy counter) {
        int count = 0;
        for (Product prod : products) {
            count = count + counter.count(prod);
        }
        return count;
    }

}
