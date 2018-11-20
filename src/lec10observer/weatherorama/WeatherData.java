package lec10observer.weatherorama;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private double temperature;
    private double humidity;
    private double pressure;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setMeasurement(double t, double h, double p) {
        temperature = t;
        humidity = h;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

}
