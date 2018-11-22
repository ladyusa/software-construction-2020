package lec02interface.lec21simpleinterface;

public class Student implements Measurable {
    private String name;
    private double score;

    public Student(String name) {
        this.name = name;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return score;
    }
}
