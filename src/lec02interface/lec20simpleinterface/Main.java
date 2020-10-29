package lec02interface.lec20simpleinterface;

import java.security.Key;

public class Main {
    public static void main(String[] args) {

        Piano piano = new Piano();
        Organ organ = new Organ();

        Pianist beethoven = new Pianist("Beethoven", new Piano());
        beethoven.doremi();

        //Keyboard keyboard = new Keyboard();
    }
}
