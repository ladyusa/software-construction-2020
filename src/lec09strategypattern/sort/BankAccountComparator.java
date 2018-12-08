package lec09strategypattern.sort;

public class BankAccountComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        BankAccount b1 = (BankAccount) o1;
        BankAccount b2 = (BankAccount) o2;
        if (b1.getBalance() < b2.getBalance())
            return -1;
        if (b1.getBalance() == b2.getBalance())
            return 0;
        return 1;
    }
}
