package overriding;

public class FarmingCreditManager extends BaseCreditManager {
    public double calculate(double amount) {
        return amount * 1.15;
    }
}
