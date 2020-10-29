package lec10observer.version1subjectinterface.data;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(double data);
}
