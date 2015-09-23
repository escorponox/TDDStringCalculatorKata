package calculator;

public class NegativeNumberException extends Exception{

    public NegativeNumberException(String message) {
        super("negatives not allowed: " + message);
    }
}
