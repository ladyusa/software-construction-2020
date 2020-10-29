package lec10observer.version3javautil.data;

import java.util.Observable;

public class Rice extends Observable {
    private double price;

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }

    public double getPrice() {
        return price;
    }
}
