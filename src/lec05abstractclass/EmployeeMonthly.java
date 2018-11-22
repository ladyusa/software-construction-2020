package lec05abstractclass;

public class EmployeeMonthly extends Employee {
    private double salary;

    public EmployeeMonthly(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public double getPayment() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " salary: " + salary;
    }
}
