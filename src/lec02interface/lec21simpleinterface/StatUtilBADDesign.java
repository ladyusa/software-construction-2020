package lec02interface.lec21simpleinterface;

public class StatUtilBADDesign {

    /**
     * if Student, Circle, Country do not implement
     * Measurable interface, average code is duplicated
     *
     * ------- bad design and implementation practices
     *
     * @param elements
     * @return
     */
    public static double average(Student[] elements) {
        double result = 0;
        for (Student e : elements) {
            result += e.getScore();
        }
        if (elements.length == 0) {
            return 0;
        }
        return result/elements.length;
    }

    public static double average(Circle[] elements) {
        double result = 0;
        for (Circle e : elements) {
            result += e.getRadius();
        }
        if (elements.length == 0) {
            return 0;
        }
        return result/elements.length;
    }

    public static double average(Country[] elements) {
        double result = 0;
        for (Country e : elements) {
            result += e.getArea();
        }
        if (elements.length == 0) {
            return 0;
        }
        return result/elements.length;
    }
}

