package lec02interface.lec20simpleinterface;

public class Flute implements Woodwind {
    @Override
    public void blow(int i) {
        System.out.println("Blow and press at button " + i);
    }
}
