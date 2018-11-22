package lec05abstractclass;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    /**
     * If method is different for each subclass, and
     * there is no sensible code for the superclass,
     * we should declare the method to be abstract.
     * @return
     */
    public abstract double getPayment();

    @Override
    public String toString() {
        return "name: " + name + " id: " + id;
    }
}
