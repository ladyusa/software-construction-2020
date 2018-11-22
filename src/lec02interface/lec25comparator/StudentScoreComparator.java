package lec02interface.lec25comparator;

import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() < o2.getScore()) return -1;
        if (o1.getScore() > o2.getScore()) return 1;
        return 0;
    }
}
