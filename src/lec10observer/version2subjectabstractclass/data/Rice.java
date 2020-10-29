package lec10observer.version2subjectabstractclass.data;

import version2subjectabstractclass.util.Subject;

public class Rice extends Subject {
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }

    public double getPrice() {
        return price;
    }
}
