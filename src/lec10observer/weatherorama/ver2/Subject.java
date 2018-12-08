package lec10observer.weatherorama.ver2;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
