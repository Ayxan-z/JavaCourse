package overriding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers = {new FarmingCreditManager(), new TeacherCreditManager()};
        for (BaseCreditManager baseCreditManager: baseCreditManagers) {
            System.out.println(baseCreditManager.calculate(1000));
        }
    }
}
