package lec08junittesting.shape;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.pow((x * x) + (y * y), 0.5);
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}
