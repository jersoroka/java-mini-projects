package exceptions;

public class OutOfBoundsException extends Exception {

    public OutOfBoundsException(int i) {
        super("The provided integer must be in the range of 0 to 16. Please provide a valid input.");
    }
}
