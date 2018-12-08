package lec09strategypattern.duckver3strategypattern;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("This is red head");
    }
}
