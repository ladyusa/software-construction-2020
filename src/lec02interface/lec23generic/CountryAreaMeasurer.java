package lec02interface.lec23generic;

public class CountryAreaMeasurer implements Measurer<Country> {

    @Override
    public double measure(Country obj) {

        // safe เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Country แน่นอน
        return obj.getArea();
    }
}
