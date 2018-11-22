package lec08junittesting.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearTest {

    @Test
    void notLeapYearNotDivisibleBy4() {
        boolean result = LeapYear.isLeapYear(2018);
        assertEquals(false, result);
    }

    @Test
    void leapYearDivisibleBy4_Not400_Not100() {
        boolean result = LeapYear.isLeapYear(1704);
        assertEquals(true, result);
    }

    @Test
    void leapYearDivisibleBy400() {
        boolean result = LeapYear.isLeapYear(2000);
        assertEquals(true, result);
    }

    @Test
    void notLeapYearDivisibleBy4_And100_Not400() {
        boolean result = LeapYear.isLeapYear(1700);
        assertEquals(false, result);
    }

    @Test
    void invalidYear() {
        assertThrows(IllegalArgumentException.class,
                () -> LeapYear.isLeapYear(-1));
    }
}
