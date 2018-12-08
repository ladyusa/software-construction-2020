package lec10observer.cashregister;

import java.util.ArrayList;
import java.util.List;

public class CashRegister implements Subject {
    private double purchase; // จำนวนเงินรวมของสินค้าที่ซื้อ
    private double payment;  // จำนวนเงินรวมที่ลูกค้าจ่าย

    private List<Observer> observers;

    public CashRegister() {
        purchase = 0;
        payment = 0;

        observers = new ArrayList<>();
    }

    public void recordPurchase(double amount) {
        purchase += amount;

        notifyObservers(amount);
    }

    public void calculateTax() {
        purchase = purchase + (purchase*0.07);
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
    @Override
    public void notifyObservers(double amount) {
        for (Observer observer : observers)
            observer.update(amount);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
