package lec04collections;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        if (this.radius < other.radius) return -1;
        if (this.radius > other.radius) return 1;
        return 0;
    }
}
