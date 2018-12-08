package lec09strategypattern.duckver3strategypattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("This is mallard duck");
    }
}
