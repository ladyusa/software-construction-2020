package lec01inheritance;

import java.util.ArrayList;

public class MainPolymorphism {

    public static void main(String[] args) {

        ArrayList<BankAccount> accts = new ArrayList<>();

        accts.add(new BankAccount());
        accts.add(new SavingsAccount(0.01));
        accts.add(new CheckingAccount());

        for (int i = 0; i < accts.size(); i++) {
            BankAccount b = accts.get(i);
            b.withdraw(100);  // polymorphism : โค้ดเดียวกัน แต่ทำงานต่างกัน
        }


        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new SavingsAccount(0.01);
        BankAccount b3 = new CheckingAccount();

        withdrawFrom(b1);
        withdrawFrom(b2);
        withdrawFrom(b3);

    }

    public static void withdrawFrom(BankAccount b) {
        b.withdraw(100);   // polymorphism : โค้ดเดียวกัน แต่ทำงานต่างกัน
    }
}
