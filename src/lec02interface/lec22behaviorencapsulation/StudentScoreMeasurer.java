package lec02interface.lec22behaviorencapsulation;

public class StudentScoreMeasurer implements Measurer {
    @Override
    public double measure(Object obj) {

        // not safe, since object may not be Student
        Student student = (Student) obj;
        return student.getScore();
    }
}
