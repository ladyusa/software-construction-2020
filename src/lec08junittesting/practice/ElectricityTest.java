package lec08junittesting.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    Electricity elec;

    @BeforeEach
    void setup() {
        elec = new Electricity();
    }

    @Test
    void noMoreThan150() {
        double result = elec.calculatePrice(100);
        assertEquals(363.22, result, 0.01);
    }

    @Test
    void between150and400() {
        double result = elec.calculatePrice(200);
        assertEquals(882.22, result, 0.01);
    }

    @Test
    void moreThan400() {
        double result = elec.calculatePrice(500);
        assertEquals(2248.22, result, 0.01);
    }


    @Test
    void bvaAt150() {
        double result = elec.calculatePrice(150);
        assertEquals(525.72, result, 0.01);

        result = elec.calculatePrice(151);
        assertEquals(675.44, result, 0.01);

    }

    @Test
    void bvaAt400() {
        double result = elec.calculatePrice(400);
        assertEquals(1726.22, result, 0.01);

        result = elec.calculatePrice(401);
        assertEquals(1810.64, result, 0.01);

    }
}
