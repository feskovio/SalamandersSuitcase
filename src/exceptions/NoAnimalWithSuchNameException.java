package exceptions;

public class NoAnimalWithSuchNameException extends Exception {

    public NoAnimalWithSuchNameException(String message) {
        super(message);
    }
}
