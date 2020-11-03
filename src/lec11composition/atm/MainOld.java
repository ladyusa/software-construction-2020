package lec11composition.atm;

public class MainOld {

    public static void main(String[] args) {
        Bank bank = new Bank("KU Bank");
        ATM atm = new ATM(bank);

        atm.validateCustomer(1, 1234);
        System.out.println(  atm.getBalance()   );
        atm.transfer(2, 100);
        System.out.println(  atm.getBalance()   );
        atm.end();

        atm.validateCustomer(2, 2345);

        System.out.println(  atm.getBalance()   );
    }
}
