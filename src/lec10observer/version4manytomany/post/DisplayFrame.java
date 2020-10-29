package lec10observer.version4manytomany.post;

import javax.swing.*;

public class DisplayFrame extends JFrame {

    private JTextArea textArea;

    public DisplayFrame(String name) {
        this.setTitle(name);
        this.setSize(300, 200);
        this.textArea = new JTextArea(280, 180);
        this.add(textArea);
        this.setVisible(true);
    }

    public void display(String data) {
        textArea.append(data + "\n");
    }
}
