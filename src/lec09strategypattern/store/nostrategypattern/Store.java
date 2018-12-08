package lec09strategypattern.store.nostrategypattern;

import lec09strategypattern.store.withstrategypattern.CounterStrategy;

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

    public int countProductAll() {
        // can actually use return products.size()
        // but just for demonstrating
            int count = 0;
            for (Product prod : products) {
                count += 1;
            }
            return count;
        }
        // นับจำนวนสินค้าทั้งหมดที่มีเหลืออยู่ในสต็อค
    public int countProductInStock() {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }
    // จำนวนในสต็อคของสินค้าทั้งหมด
    public int countProductQuantity() {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }

    public int countProductType(String type) {
        int count = 0;
        for (Product prod : products) {
            if (prod.getType().equals(type))
                count += 1;
        }
        return count;
    }

}
