package lec8junittesting.bank;

// checked exception
public class InsufficientFundException extends Exception {
    public InsufficientFundException() {}
    public InsufficientFundException(String reason) {
        super(reason);
    }
}
