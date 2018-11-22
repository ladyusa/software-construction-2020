package lec08junittesting.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void distanceFromOriginPositive() {
        Point p = new Point(3, 4);
        double dist = p.distanceFromOrigin();

        assertEquals(5.0, dist);
    }

    @Test
    void distanceFromOriginOneOne() {
        Point p = new Point(1, 1);
        double dist = p.distanceFromOrigin();

        assertEquals(1.4142, dist, 0.001);
    }

    @Test
    void translatePositiveDeltas() {
        Point p = new Point(3, 4);
        p.translate(10, 10);

        assertEquals(13, p.getX());
        assertEquals(14, p.getY());
    }

}
