package lec09strategypattern.store.withstrategypattern;

public class CountQuantity implements CounterStrategy {
    @Override
    public int count(Product product) {
        return product.getQuantity();
    }
}
