package lec10observer.version1subjectinterface.post;

import java.util.ArrayList;
import java.util.List;

public class FacebookPage implements Subject {
    private String name;
    private List<String> posts;
    private List<Observer> observers;

    public FacebookPage(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String data) {
        for (Observer o : observers)
            o.update(data);
    }

    public void post(String message) {
        posts.add(message);
        notifyObservers(message);
    }
}
