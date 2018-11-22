package lec02interface.lec21simpleinterface;

public class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getMeasure() {
        return radius;
    }
}
