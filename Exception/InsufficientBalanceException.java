package Exception;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message); // pass the massage to parent exception class
    }
}

