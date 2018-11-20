package lec10observer.weatherorama;

public interface Observer {
    void update(double temp, double humid, double pressure);
}
