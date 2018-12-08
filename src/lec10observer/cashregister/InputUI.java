package lec10observer.cashregister;

import java.util.Scanner;

public class InputUI {

    public void receive(CashRegister cashRegister) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("----- Please input purchase -----");

            System.out.print("purchase: ");
            double amount = Double.parseDouble(in.nextLine());

            // set new data, causing weatherData subject
            // to "notify" all observers (via calling an update() method)
            cashRegister.recordPurchase(amount);
        }

        cashRegister.calculateTax();
        System.out.print("enter payment: ");
        double payment = Double.parseDouble(in.nextLine());
        cashRegister.enterPayment(payment);
        double change = cashRegister.giveChange();
        System.out.println("Change: " + change);

    }
}
