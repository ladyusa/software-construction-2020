package lec10observer.version2subjectabstractclass.data;

import lec10observer.version2subjectabstractclass.util.Observer;
import lec10observer.version2subjectabstractclass.util.Subject;

public class NewsRoom implements Observer {

    private Subject subject;

    public NewsRoom(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Object obj) {
        double data = ((Double) obj).doubleValue();
        System.out.println("Current Rice Price : " + data);
    }
}
