package lec09strategypattern.email.nopattern;

public class Main {

    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");
        EmailSystem emailSystem = new EmailSystem();
        emailSystem.sendCaesar(email1, 2);
        System.out.println(email1.getText());
        emailSystem.sendSwitchCipher(email2);
        System.out.println(email2.getText());
    }

}
