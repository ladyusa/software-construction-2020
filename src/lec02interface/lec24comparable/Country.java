package lec02interface.lec24comparable;

public class Country implements Comparable<Country> {
    private String name;
    private double area;
    private int population;
    private double GDP;

    public Country(String name, double area, int pop, double gdp) {
        this.name = name;
        this.area = area;
        this.population = pop;
        this.GDP = gdp;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }

    public double getGDP() {
        return GDP;
    }

    @Override
    public int compareTo(Country other) {
        // เปรียบเทียบ this object กับ other object ใน parameter
        if (this.area < other.area) return -1;
        if (this.area > other.area) return 1;
        return 0; // this.area == other.area
    }
}
