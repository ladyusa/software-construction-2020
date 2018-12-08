package lec10observer.weatherorama.ver1;

import javax.swing.*;
import java.awt.*;

public class StatisticsDisplay implements Observer {

    private double prevTemp;

    private JFrame frame;
    private JTextArea area;

    public StatisticsDisplay() {

        frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Average Condition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setBackground(Color.ORANGE);
        area.setText("Average Condition:\n");

    }

    @Override
    public void update(double temp, double humid, double pressure) {
        if (prevTemp == 0)
            prevTemp = temp;
        double avg = (prevTemp + temp)/2;
        prevTemp = avg;

        area.setBackground(Color.ORANGE);
        area.setText("Average Condition:\n");
        area.append("Temperature = "+avg);

    }
}
