package lec10observer.version1subjectinterface.post;

import java.time.LocalDateTime;

public class User implements Observer {

    private String name;
    private DisplayFrame frame;

    public User(String name) {
        this.name = name;
        this.frame = new DisplayFrame(name);
    }

    public void follow(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(String data) {
        frame.display(LocalDateTime.now() + " : " + data);
    }
}
