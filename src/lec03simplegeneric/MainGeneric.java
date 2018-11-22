package lec03simplegeneric;

public class MainGeneric {

    public static void main(String[] args) {
        GenericQueue<String> qstring = new GenericQueue<String>();
        qstring.enqueue("Hello");
        qstring.enqueue("World");
        System.out.println("Dequeue String: "+qstring.dequeue());

        GenericQueue<Integer> qint = new GenericQueue<>();
        qint.enqueue(8);
        qint.enqueue(20);
        System.out.println("Dequeue int: "+qint.dequeue());

        GenericQueue<Circle> qcircle = new GenericQueue<>();
        qcircle.enqueue(new Circle(10));
        qcircle.enqueue(new Circle(20));
        System.out.println("Dequeue Circle: "+qcircle.dequeue().getRadius());
    }
}
