package lec02interface.lec21simpleinterface;

public class MainInterface {

    public static void main(String[] args) {
        Student[] students = {new Student("A"), new Student("B"),
                new Student("C")};
        students[0].setScore(1);
        students[1].setScore(2);
        students[2].setScore(3);

        double stdAvg = StatUtil.average(students);
        System.out.println("Student Score Average: "+stdAvg);

        Circle[] circles = {new Circle(4), new Circle(5),
                new Circle(6)};

        double circleAvg = StatUtil.average(circles);
        System.out.println("Circle Radius Average: "+circleAvg);

        Country[] countries = {
                new Country("Thailand", 500000, 66, 1.2),
                new Country("USA", 2000000, 300, 18),
                new Country("UK", 600000, 50, 15) };

        double countryAreaAvg = StatUtil.average(countries);
        System.out.println("Country Area Average: "+countryAreaAvg);
    }
}
