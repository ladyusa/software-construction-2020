package lec02interface.lec25comparator;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if (o1.getArea() < o2.getArea()) return -1;
        if (o1.getArea() > o2.getArea()) return 1;
        return 0;
    }
}
