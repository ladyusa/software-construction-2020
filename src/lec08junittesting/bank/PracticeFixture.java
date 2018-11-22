package lec08junittesting.bank;

import org.junit.jupiter.api.*;

public class PracticeFixture {

    @BeforeAll
    static void setupAll() {
        System.out.println("--- before all ---");
    }

    @BeforeEach
    void setup() {
        System.out.println("before each");
    }

    @Test
    void test1() {
        System.out.println("test case 1");
    }

    @Test
    void test2() {
        System.out.println("test case 2");
    }

    @AfterEach
    void teardown() {
        System.out.println("after each");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("--- after all ---");
    }
}
