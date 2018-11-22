package lec02interface.lec23generic;

public class StatUtil {

    /**
     * Generic methods for calculating average
     *
     * @param elements
     * @param meas
     * @param <T>
     * @return
     */
    public static <T> double average(T[] elements, Measurer<T> meas) {
        double result = 0;
        for (T e : elements) {
            result += meas.measure(e);  // polymorphism
        }
        if (elements.length != 0) {
            return result/elements.length;
        }
        return 0;
    }

}

