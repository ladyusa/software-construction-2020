package lec10observer.version4manytomany.post;

import lec10observer.version4manytomany.util.Subject;

import java.util.HashMap;
import java.util.Map;

public class StockExchangeOfThailand extends Subject {
    private Map<String,Stock> stocks;

    public StockExchangeOfThailand() {
        this.stocks = new HashMap<>();
    }

    public void updateStock(String name, double price) {
        stocks.put(name, new Stock(name, price));
        notifyObservers(stocks.get(name).toString());
    }

    class Stock {
        private String name;
        private double price;

        public Stock(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
