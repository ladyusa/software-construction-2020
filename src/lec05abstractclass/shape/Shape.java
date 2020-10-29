package lec05abstractclass.shape;

public abstract class Shape {
    private double x, y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distance() {
        return Math.pow(x*x + y*y, 0.5);
    }

    @Override
    public String toString() {
        return "x=" + x +
               ", y=" + y;
    }
}
