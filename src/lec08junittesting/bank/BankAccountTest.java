package lec08junittesting.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(100);
        System.out.println("in before each");
    }

    @Test
    void withdrawLessThanBalance() throws InsufficientFundException {
        account.withdraw(20);
        assertEquals(80, account.getBalance());
    }

    @Test
    void withdrawMoreThanBalance_ThrowsException() throws InsufficientFundException {

        assertThrows(InsufficientFundException.class,
                () -> account.withdraw(500));
    }

    @Test
    void withdrawMoreThanBalance_ThrowsExceptionWithMessage() throws InsufficientFundException {

        Throwable exception = assertThrows(InsufficientFundException.class,
                () -> account.withdraw(500));

        assertEquals("Amount must be less than balance",
                exception.getMessage());
    }
}
