package lec10observer.version3javautil.data;

import java.util.Observable;
import java.util.Observer;

public class NewsRoom implements Observer {

    private Observable subject;

    public NewsRoom(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        double data = ((Double) arg).doubleValue();
        System.out.println("Current Rice Price : " + data);
    }

}
