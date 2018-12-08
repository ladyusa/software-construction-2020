package lec09strategypattern.store.withstrategypattern;

public class CountType implements CounterStrategy {
    private String type;

    public CountType(String type) {
        this.type = type;
    }

    @Override
    public int count(Product product) {
        if (product.getType().equals(type))
            return 1;
        return 0;
    }
}
