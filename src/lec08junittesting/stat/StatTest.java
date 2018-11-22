package lec08junittesting.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatTest {

    @Test
    public void averagePositiveValues() {
        int[] data1 = { 70, 5, 40 };
        StatCalculator cal = new StatCalculator();
        int avg1 = cal.average(data1);

        assertEquals(38, avg1, "average equals to sum divided by length");

    }

    @Test
    void averageEmptyArray() {
        int[] data =  { };
        StatCalculator cal = new StatCalculator();
        int avg1 = cal.average(data);

        assertEquals(0, avg1, "empty array should return 0");
    }

    @Test
    void averageOneValue() {
        int[] data =  { 5 };
        StatCalculator cal = new StatCalculator();
        int avg1 = cal.average(data);

        assertEquals(5, avg1);

    }
}
