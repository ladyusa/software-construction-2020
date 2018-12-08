package lec11oodesign.invoice;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private Map<Integer, Product> productCalalog;

    public Store() {
        productCalalog = new HashMap<>();
    }

    public void addProduct(int id, String desc, double price) {
        productCalalog.put(id, new Product(id, desc, price));
    }

    public Product getProduct(int id) {
        return productCalalog.get(id);
    }
}
