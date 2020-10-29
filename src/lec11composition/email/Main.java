package lec11composition.email;

public class Main {
    public static void main(String[] args) {
        EmailSystem system = new EmailSystem();
        EmailUI ui = new EmailUI();
        ui.run(system);
    }

}
