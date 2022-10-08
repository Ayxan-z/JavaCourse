package ploymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger baseLogger) {
        this.logger = baseLogger;
    }

    public void add() {
        System.out.println("Added customer");
        this.logger.log("message");
    }
}
