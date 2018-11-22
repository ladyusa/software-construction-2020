package lec08junittesting.bank;

// checked exception
public class InsufficientFundException extends Exception {
    public InsufficientFundException() {}
    public InsufficientFundException(String reason) {
        super(reason);
    }
}
