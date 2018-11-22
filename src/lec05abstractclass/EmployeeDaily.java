package lec05abstractclass;

public class EmployeeDaily extends Employee {
    private static double dailyRate = 400;
    private int numDays;

    public EmployeeDaily(String name, int id) {
        super(name, id);
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public static void setDailyRate(double rate) {
        dailyRate = rate;
    }

    public double getPayment() {
        return dailyRate * numDays;
    }
}
