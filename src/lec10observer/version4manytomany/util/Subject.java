package lec10observer.version4manytomany.util;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(Object obj) {
        for (Observer o : observers)
            o.update(obj);
    }

}
