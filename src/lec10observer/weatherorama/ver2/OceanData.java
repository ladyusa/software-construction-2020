package lec10observer.weatherorama.ver2;

public class OceanData extends Subject {
    private double waveHeight;
    private double windGust;

    public double getWaveHeight() {
        return waveHeight;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWaveHeight(double waveHeight) {
        this.waveHeight = waveHeight;
        notifyObservers();
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
        notifyObservers();
    }
}
