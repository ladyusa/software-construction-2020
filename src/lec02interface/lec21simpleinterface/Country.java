package lec02interface.lec21simpleinterface;

public class Country implements Measurable {
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
    public double getMeasure() {
        return area;
    }
}
