package lec10observer.otherexamples.cashregister;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(double amount);
}
