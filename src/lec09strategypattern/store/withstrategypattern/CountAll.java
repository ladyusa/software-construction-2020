package lec09strategypattern.store.withstrategypattern;

public class CountAll implements CounterStrategy {
    @Override
    public int count(Product product) {
        return 1;
    }
}
