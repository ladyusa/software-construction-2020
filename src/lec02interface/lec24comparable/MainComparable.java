package lec02interface.lec24comparable;


import java.util.Arrays;

public class MainComparable {

    public static void main(String[] args) {
        Student[] students = {new Student("A"), new Student("B"),
                new Student("C")};
        students[0].setScore(8);
        students[1].setScore(2);
        students[2].setScore(5);

        // sort() method is similar to average() method, it is reused through
        // Comparable interface. Any class that implements Comparable
        // interface can be sorted using this sort method.
        // (sort() method calls compareTo() method; similar to that
        //  average() method calls getMeasure() method
        //
        // sort() method นั้นคล้ายกับ average() method โดย sort() method นั้นมีการ reuse
        // ผ่าน Comparable interface กล่าวคือ คลาสใด ๆ ที่ implements Comparable
        // interface จะสามารถถูกเรียงลำดับได้ โดยใช้ sort() method นี้
        // (sort() method เรียก compareTo() method คล้ายกับที่
        //  average() method เรียก getMeasure() method)
        //
        Arrays.sort(students);
        System.out.print("Student score after sort: ");
        for (Student student : students) {
            System.out.print(student.getScore() + " ");
        }
        System.out.println();

        Circle[] circles = {new Circle(7), new Circle(2),
                new Circle(9)};

        Arrays.sort(circles);
        System.out.print("Circle radius after sort: ");
        for (Circle circle : circles) {
            System.out.print(circle.getRadius() + " ");
        }
        System.out.println();

        Country[] countries = {
                new Country("Thailand", 500000, 66, 1.2),
                new Country("USA", 2000000, 300, 18),
                new Country("UK", 600000, 50, 15) };

        Arrays.sort(countries);
        System.out.print("Country area after sort: ");
        for (Country country : countries) {
            System.out.print(country.getArea() + " ");
        }
        System.out.println();
    }
}
