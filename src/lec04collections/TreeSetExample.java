package lec04collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        // TreeSet of String Type
        TreeSet<String> tset = new TreeSet<>();

        // Adding elements to TreeSet<String>
        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");

        //Displaying TreeSet
        System.out.println(tset);

        // TreeSet of Integer Type
        TreeSet<Integer> tset2 = new TreeSet<>();

        // Adding elements to TreeSet<Integer>
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        System.out.println(tset2);

        Circle c1 = new Circle(7);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(9);

        HashSet<Circle> circleHashSet = new HashSet<>();
        circleHashSet.add(c1);
        circleHashSet.add(c2);
        circleHashSet.add(c3);

        // tree set using Comparable interface
        TreeSet<Circle> circleTreeSet = new TreeSet<>();
        circleTreeSet.add(c1);
        circleTreeSet.add(c2);
        circleTreeSet.add(c3);

        System.out.print("Circle hash set : ");
        for (Circle circle : circleHashSet) {
            System.out.print(circle.getRadius() + " ");
        }
        System.out.println();

        System.out.print("Circle tree set : ");
        for (Circle circle : circleTreeSet) {
            System.out.print(circle.getRadius() + " ");
        }
        System.out.println();

        Student s1 = new Student("A", 8);
        Student s2 = new Student("B", 2);
        Student s3 = new Student("C", 5);

        // tree set using Comparator interface
        TreeSet<Student> studentTreeSet = new TreeSet<>(new StudentComparator());
        studentTreeSet.add(s1);
        studentTreeSet.add(s2);
        studentTreeSet.add(s3);

        System.out.print("Student tree set : ");
        for (Student student : studentTreeSet) {
            System.out.print(student.getScore() + " ");
        }
        System.out.println();
    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getScore() < o2.getScore()) return -1;
            if (o1.getScore() > o2.getScore()) return 1;
            return 0;
        }
    }
}
