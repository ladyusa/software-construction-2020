package lec08junittesting.practice;

public class Electricity {

    public double calculatePrice(int unit) {
        double monthlyFee = 38.22;

        double price;
        if (unit <= 150)
            price = unit * 3.25;
        else if (unit <= 400)
            price = unit * 4.22;
        else
            price = unit * 4.42;

        return price + monthlyFee;
    }
}
