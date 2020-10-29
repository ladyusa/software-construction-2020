package lec02interface.lec20simpleinterface;

// client ของ interface Keyboard
//   เกิดความยืดหยุ่น สามารถใช้งาน implementation ใด ๆ
//   ของ interface Keyboard ได้
public class Pianist {

    private String name;
    private Keyboard keyboard;

    public Pianist(String name, Keyboard keyboard) {
        this.name = name;
        this.keyboard = keyboard;
    }

    public void doremi() {
        keyboard.pressKeyWhite(1);
        keyboard.pressKeyWhite(2);
        keyboard.pressKeyWhite(3);
    }

}
