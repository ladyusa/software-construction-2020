package lec10observer.weatherorama.ver2;

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

        area = new JTextArea(200, 200);
        frame.add(area);
        area.setBackground(Color.ORANGE);
        area.setText("Average Condition:\n");

    }

    @Override
    public void update(Subject data) {
        if (data instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) data;

            if (prevTemp == 0)
                prevTemp = weatherData.getTemperature();
            double avg = (prevTemp + weatherData.getTemperature()) / 2;
            prevTemp = avg;

            area.setBackground(Color.ORANGE);
            area.setText("Average Condition:\n");
            area.append("Temperature = " + avg);
        }
    }
}
