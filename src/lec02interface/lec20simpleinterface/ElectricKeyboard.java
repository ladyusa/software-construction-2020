package lec02interface.lec20simpleinterface;

public class ElectricKeyboard implements Keyboard {
    @Override
    public void pressKeyWhite(int i) {
        System.out.println("send electric signal to key "+i);
    }

    @Override
    public void pressKeyBlack(int i) {
        System.out.println("send electric signal to key "+i+".5");
    }
}
