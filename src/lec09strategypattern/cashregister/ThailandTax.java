package lec09strategypattern.cashregister;

public class ThailandTax implements TaxCalculator {
    @Override
    public double calculateTax(double purchase) {
        return purchase * 0.07;
    }
}
