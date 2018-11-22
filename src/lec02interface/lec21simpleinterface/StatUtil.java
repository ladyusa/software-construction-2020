package lec02interface.lec21simpleinterface;

public class StatUtil {

    /**
     * Interface helps code reuse. We can calculate average for
     * Circle, Country, Student objects using only one average method
     *
     * No code duplication -- conform with DRY design principle
     *
     * DRY --- Don't Repeat Yourself
     *
     * @param elements
     * @return average value of specified elements
     */
    public static double average(Measurable[] elements) {
        double result = 0;
        for (Measurable e : elements) {
            result += e.getMeasure();  // polymorphism
        }
        if (elements.length != 0) {
            return result/elements.length;
        }
        return 0;
    }

}

