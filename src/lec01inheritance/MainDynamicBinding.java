package lec01inheritance;

public class MainDynamicBinding {
    public static void main(String[] args) {

        // static type และ type ของ object จริงของ c คือ CheckingAccount
        // ดังนั้น ชัดเจนว่า จาวาจะเลือกใช้เมธอด withdraw() เวอร์ชันของ
        // CheckingAccount
        CheckingAccount c = new CheckingAccount();
        c.deposit(100);
        c.withdraw(20);
        c.withdraw(20);
        c.withdraw(20);
        c.withdraw(20);
        System.out.println(c.getBalance());

        // ในกรณี BankAccount b = new CheckingAccount();
        // static type ของ b คือ BankAccount
        // type ของ object จริงของ b คือ CheckingAccount
        // === dynamic binding (late binding) === :
        // หาก subclass overrides เมธอดของ superclass
        // java จะใช้ dynamic binding โดยเลือกเมธอดจาก
        // type ของ object จริง ไม่ใช่ static type ของ reference
        BankAccount b = new CheckingAccount();
        b.deposit(100);
        b.withdraw(20);
        b.withdraw(20);
        b.withdraw(20);
        b.withdraw(20);
        System.out.println(b.getBalance());

    }

}
