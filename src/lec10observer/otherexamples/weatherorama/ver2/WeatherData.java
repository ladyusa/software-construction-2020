package lec10observer.otherexamples.weatherorama.ver2;

public class WeatherData extends Subject {

    private double temperature;
    private double humidity;
    private double pressure;

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
}
