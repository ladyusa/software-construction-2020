package lec10observer.cashregister;

import javax.swing.*;
import java.awt.*;

public class TotalPurchaseDisplay implements Observer {

    private JFrame frame;
    private JTextArea area;

    private double total;

    public TotalPurchaseDisplay() {
        frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Total Purchase");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setBackground(Color.YELLOW);
        area.setText("Total Purchase:\n\n");
    }

    @Override
    public void update(double amount) {
        total += amount;

        area.setBackground(Color.YELLOW);
        area.setText("Total Purchase: " + total + "\n\n");
    }
}
