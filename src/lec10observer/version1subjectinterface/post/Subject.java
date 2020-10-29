package lec10observer.version1subjectinterface.post;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String data);
}
