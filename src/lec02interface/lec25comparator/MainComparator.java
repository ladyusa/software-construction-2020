package lec02interface.lec25comparator;

import java.util.Arrays;
import java.util.Comparator;

public class MainComparator {

    public static void main(String[] args) {
        Circle[] circles = {new Circle(7), new Circle(2),
                new Circle(9)};

        // Comparator interface is similar to Measurer interface
        // allows objects to be sorted with more flexibility
        Arrays.sort(circles, new CircleRadiusComparator());
        System.out.print("Circle radius after sort: ");
        for (Circle circle : circles) {
            System.out.print(circle.getRadius() + " ");
        }
        System.out.println();

        Country[] countries = {
                new Country("Thailand", 500000, 66, 1.2),
                new Country("USA", 2000000, 300, 18),
                new Country("UK", 600000, 50, 15) };

        Arrays.sort(countries, new CountryAreaComparator());
        System.out.print("Country area after sort: ");
        for (Country country : countries) {
            System.out.print(country.getArea() + " ");
        }
        System.out.println();

        Arrays.sort(countries, new CountryPopulationComparator());
        System.out.print("Country population after sort: ");
        for (Country country : countries) {
            System.out.print(country.getPopulation() + " ");
        }
        System.out.println();

        Student[] students = {new Student("Kwan"), new Student("John"),
                new Student("Ann")};
        students[0].setScore(8);
        students[1].setScore(2);
        students[2].setScore(5);

        Arrays.sort(students, new StudentScoreComparator());
        System.out.print("Student score after sort: ");
        for (Student student : students) {
            System.out.print(student.getScore() + " ");
        }
        System.out.println();

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.print("Student name after sort: ");
        for (Student student : students) {
            System.out.print(student.getName() + " ");
        }
        System.out.println();

    }

    // nested class can be defined outside method but within class
    static class CountryPopulationComparator implements Comparator<Country> {

        @Override
        public int compare(Country o1, Country o2) {
            if (o1.getPopulation() < o2.getPopulation()) return -1;
            if (o1.getPopulation() > o2.getPopulation()) return 1;
            return 0;
        }
    }
}
