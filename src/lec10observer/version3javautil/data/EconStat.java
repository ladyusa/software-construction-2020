package lec10observer.version3javautil.data;


import java.util.Observable;
import java.util.Observer;

public class EconStat implements Observer {
    private Observable subject;
    private double min;
    private double max;
    private double average;
    private double numData;

    public EconStat(Observable subject) {
        this.subject = subject;
        subject.addObserver(this);
        this.min = 999999;
        this.max = -999999;
        this.numData = 0;
    }

    private void display() {
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Average : " + average);
    }

    @Override
    public void update(Observable o, Object arg) {
        double data = ((Double) arg).doubleValue();
        if (data < min) min = data;
        if (data > max) max = data;
        average = (average * numData + data) / (numData + 1);
        numData += 1;
        display();
    }
}
