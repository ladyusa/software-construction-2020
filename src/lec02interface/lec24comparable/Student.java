package lec02interface.lec24comparable;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) return -1;
        if (this.score > o.score) return 1;
        return 0;
    }
}
