package kodlama.io.devs.exceptions;


public class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("name cannot be null");
    }
}