package Exceptions;

public class ArgNotFoundException extends Exception {
    public ArgNotFoundException(String arg) {
        super(String.format("No arg found for '%s'",arg));
    }
}
