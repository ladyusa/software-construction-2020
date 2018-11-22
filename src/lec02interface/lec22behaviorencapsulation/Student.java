package lec02interface.lec22behaviorencapsulation;

public class Student {
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


}
