package lec09strategypattern.cashregister;

public class CashRegisterNoStrategyPattern {
    private double purchase; // จำนวนเงินรวมของสินค้าที่ซื้อ
    private double payment;  // จำนวนเงินรวมที่ลูกค้าจ่าย

    public CashRegisterNoStrategyPattern() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTaxThailand() {
        purchase = purchase + (purchase*0.07);
    }

    public void calculateTaxNY() {
        if (purchase > 100)
            purchase = purchase + (purchase*0.08);
    }

    public void calculateTaxCA() {
        purchase = purchase + (purchase*0.075);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
