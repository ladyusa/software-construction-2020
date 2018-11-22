package lec02interface.lec23generic;

public class CircleRadiusMeasurer implements Measurer<Circle> {

    @Override
    public double measure(Circle obj) {

        // safe เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Circle แน่นอน
        return obj.getRadius();
    }
}
