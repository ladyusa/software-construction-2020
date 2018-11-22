package lec01inheritance;

public class MainStaticBinding {
    public static void main(String[] args) {

        // static type of s is SavingsAccount
        // (type ของ reference s คือ SavingsAccount)
        //   === static binding (early binding) ===
        // ผูก reference s กับ SavingsAccount type
        // หลังผูกชนิดข้อมูล (type/class) เข้ากับตัวแปรแล้ว java จะตัดสินใจได้ว่า
        // จะเรียกเมธอดใด โดยดูจากชนิดของข้อมูล (type/class)
        SavingsAccount s = new SavingsAccount(0.05);
        s.deposit(100);
        s.withdraw(20);
        s.getBalance();
        s.addInterest();

        // static type of b is BankAccount
        // (type ของ reference b คือ BankAccount)
        //   === static binding (early binding) ===
        // ผูก reference b กับ BankAccount type
        // เนื่องจาก b มี static type เป็น BankAccount ซึ่งไม่มีเมธอด
        // addInterest() จึงไม่สามารถเรียก addInterest() จาก b ได้
        BankAccount b = new SavingsAccount(0.01);
        b.deposit(100);
        b.withdraw(20);
        b.getBalance();
        //b.addInterest();   // ----> compile error


        // ถ้าต้องการใช้เมธอด addInterest() จาก b สามารถ cast ได้ดังนี้
        ((SavingsAccount)b).addInterest();

        // แต่ต้องระวังให้มากเมื่อใช้การ case เนื่องจากหาก object จริงไม่ใช่
        // SavingsAccount เราก็ยังสามารถ cast ได้ ถ้า static type ของ
        // reference เป็น superclass ของ SavingsAccount เช่น
        BankAccount c = new CheckingAccount();
        // จะเห็นว่าไม่มี compile error แม้ว่า c จะเป็น
        // CheckingAccount ไม่ใช่ SavingsAccount
        // cast is dangerous : ไม่ควรใช้ถ้าไม่จำเป็น
        ((SavingsAccount)c).addInterest();

        // ถ้าจำเป็นต้องใช้ cast ให้ตรวจสอบก่อน ด้วย instanceof
        if (b instanceof SavingsAccount) {
            ((SavingsAccount)b).addInterest();
        }

    }

}
