package lec02interface.lec22behaviorencapsulation;

public class CountryPopulationMeasurer implements Measurer {

    @Override
    public double measure(Object obj) {

        // not safe, since object may not be Country
        Country country = (Country) obj;
        return country.getPopulation();
    }
}
