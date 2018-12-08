package lec09strategypattern.store.withstrategypattern;

public class CountInStock implements CounterStrategy {
    @Override
    public int count(Product product) {
        if (product.getQuantity() > 0)
            return 1;
        return 0;
    }
}
