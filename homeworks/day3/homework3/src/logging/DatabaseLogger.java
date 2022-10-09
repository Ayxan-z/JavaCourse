package logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Logging to db: " + data);
    }
}
