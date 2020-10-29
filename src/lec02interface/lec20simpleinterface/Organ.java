package lec02interface.lec20simpleinterface;

public class Organ implements Keyboard {
    @Override
    public void pressKeyWhite(int i) {
        System.out.println("Blow wind in pipe " + i);
    }

    @Override
    public void pressKeyBlack(int i) {
        System.out.println("Blow wind in pipe " + i + ".5");
    }
}
