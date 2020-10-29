package lec10observer.otherexamples.weatherorama.ver1;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
