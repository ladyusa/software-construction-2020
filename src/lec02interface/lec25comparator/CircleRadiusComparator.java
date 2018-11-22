package lec02interface.lec25comparator;

import java.util.Comparator;

public class CircleRadiusComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() < o2.getRadius()) return -1;
        if (o1.getRadius() > o2.getRadius()) return 1;
        return 0;
    }
}
