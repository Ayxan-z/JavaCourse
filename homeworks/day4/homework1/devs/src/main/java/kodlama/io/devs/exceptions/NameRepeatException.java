package kodlama.io.devs.exceptions;


public class NameRepeatException extends Exception {
    public NameRepeatException(String name) {
        super("this programming language has been added before: " + name);
    }
}
