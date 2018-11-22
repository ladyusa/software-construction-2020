package lec02interface.lec23generic;

public class MainGeneric {

    public static void main(String[] args) {
        Student[] students = {new Student("A"), new Student("B"),
                new Student("C")};
        students[0].setScore(1);
        students[1].setScore(2);
        students[2].setScore(3);

        double stdAvg = StatUtil.average(students, new StudentScoreMeasurer());
        System.out.println("Student Score Average: "+stdAvg);

        Circle[] circles = {new Circle(4), new Circle(5),
                new Circle(6)};

        double circleAvg = StatUtil.average(circles, new CircleRadiusMeasurer());
        System.out.println("Circle Radius Average: "+circleAvg);

        Country[] countries = {
                new Country("Thailand", 500000, 66, 1.2),
                new Country("USA", 2000000, 300, 18),
                new Country("UK", 600000, 50, 15) };

        double countryAreaAvg = StatUtil.average(countries, new CountryAreaMeasurer());
        System.out.println("Country Area Average: "+countryAreaAvg);

        // we can use anonymous class to define small class
        double countryPopAvg = StatUtil.average(countries, new Measurer<Country>() {
                    @Override
                    public double measure(Country obj) {
                        return obj.getPopulation();
                    }
                });
        System.out.println("Country Population Average: " + countryPopAvg);

        // we can also use nested class to define small class
        // this way, we can instantiate object of this nested class
        // several places within this method
        // nested class can also be defined outside method but within class too
        class CountryGDPMeasurer implements Measurer<Country> {

            @Override
            public double measure(Country obj) {
                return obj.getGDP();
            }
        }
        double countryGDPAvg = StatUtil.average(countries, new CountryGDPMeasurer());
        System.out.println("Country GDP Average: "+countryGDPAvg);

        // ใช้ student objects แต่ measurer เป็นของ Country
        // เมื่อใช้ generic สามารถตรวจจับข้อผิดพลาดได้ทันที ตั้งแต่ช่วง compile
        //double compileErrorExample = StatUtil.average(students, new CountryAreaMeasurer());
    }
}
