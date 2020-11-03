package lec11composition.atm;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("KU Bank");
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
