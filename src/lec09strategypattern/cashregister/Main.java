package lec09strategypattern.cashregister;

public class Main {

    public static void main(String[] args) {

        CashRegisterNoStrategyPattern registerNoPattern = new CashRegisterNoStrategyPattern();

        registerNoPattern.recordPurchase(60);
        registerNoPattern.recordPurchase(40);
        registerNoPattern.calculateTaxThailand();
        registerNoPattern.enterPayment(200);

        double change = registerNoPattern.giveChange();
        System.out.println(change);

        CashRegister cashRegister = new CashRegister(new NYTax());
        cashRegister.recordPurchase(30);
        cashRegister.calculateTax();
        cashRegister.enterPayment(100);
        System.out.println(cashRegister.giveChange());
    }
}
