package lec09strategypattern.duckver2interface;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("I am flying !!");
    }

    @Override
    public void quack() {
        System.out.println("Quack !");
    }

    @Override
    public void display() {
        System.out.println("This is Mallard Duck");
    }
}
