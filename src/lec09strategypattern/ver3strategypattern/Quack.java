package lec09strategypattern.ver3strategypattern;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
