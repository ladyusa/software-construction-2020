package lec10observer.weatherorama;

public interface Observer {
    void update(double temp, double humid, double pressure);

    void update(List<Double> data);

    void update(Subject subject, Object arg);
}
