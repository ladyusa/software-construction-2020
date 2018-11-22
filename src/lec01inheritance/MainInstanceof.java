package lec01inheritance;

public class MainInstanceof {

    public static void main(String[] args) {

        // เราสามารถใช้ instanceof ในการตรวจสอบ type ของ reference ได้
        BankAccount b = new BankAccount();
        SavingsAccount s = new SavingsAccount(0.05);
        CheckingAccount c = new CheckingAccount();

        if (b instanceof BankAccount) {
            System.out.println("b instanceof BankAccount");
        }
        if (s instanceof BankAccount) {
            System.out.println("s instanceof BankAccount");
        }
        if (c instanceof BankAccount) {
            System.out.println("c instanceof BankAccount");
        }

        if (b instanceof SavingsAccount) {
            System.out.println("b instanceof SavingsAccount");
        }
        if (s instanceof SavingsAccount) {
            System.out.println("s instanceof SavingsAccount");
        }

        if (b instanceof CheckingAccount) {
            System.out.println("b instanceof CheckingAccount");
        }
        if (c instanceof CheckingAccount) {
            System.out.println("s instanceof CheckingAccount");
        }

    }
}
