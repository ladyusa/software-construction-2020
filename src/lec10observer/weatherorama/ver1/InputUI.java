package lec10observer.weatherorama.ver1;

import java.util.Scanner;

public class InputUI {

    public void receive(WeatherData weatherData) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("----- Please input new data -----");

            System.out.print("Temperature: ");
            double temp = Double.parseDouble(in.nextLine());

            System.out.print("Humidity: ");
            double humid = Double.parseDouble(in.nextLine());

            System.out.print("Pressure: ");
            double pressure = Double.parseDouble(in.nextLine());

            // set new data, causing weatherData subject
            // to "notify" all observers (via calling an update() method)
            weatherData.setMeasurement(temp, humid, pressure);
        }
    }
}
