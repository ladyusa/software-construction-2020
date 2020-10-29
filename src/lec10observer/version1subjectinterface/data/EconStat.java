package lec10observer.version1subjectinterface.data;

public class EconStat implements Observer {
    private Subject subject;
    private double min;
    private double max;
    private double average;
    private double numData;

    public EconStat(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
        this.min = 999999;
        this.max = -999999;
        this.numData = 0;
    }

    @Override
    public void update(double data) {
        if (data < min) min = data;
        if (data > max) max = data;
        average = (average * numData + data) / (numData + 1);
        numData += 1;
        display();
    }

    private void display() {
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Average : " + average);
    }
}
