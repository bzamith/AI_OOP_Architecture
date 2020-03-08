package Exceptions;

public class ArgRequiredException extends Exception {
    public ArgRequiredException(String arg) {
        super(String.format("No required input found for arg '%s'",arg));
    }
}
