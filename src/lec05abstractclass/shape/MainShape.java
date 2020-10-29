package lec05abstractclass.shape;

public class MainShape {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2,5,6);
        Circle circle = new Circle(3,3,10);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());

        rectangle.move(10,10);
        System.out.println(rectangle);
    }
}
