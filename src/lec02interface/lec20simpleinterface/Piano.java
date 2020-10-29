package lec02interface.lec20simpleinterface;

// subtype : implementation  ของ Keyboard
public class Piano implements Keyboard {

    public void pressKeyWhite(int i) {
        System.out.println("soft hammer hit string " + i);
    }

    public void pressKeyBlack(int i) {
        System.out.println("soft hammer hit string " + i + ".5");
    }
}
