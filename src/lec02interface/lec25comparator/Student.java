package lec02interface.lec25comparator;

public class Student {
    private String name;
    private double score;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
