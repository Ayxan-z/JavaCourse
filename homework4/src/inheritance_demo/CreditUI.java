package inheritance_demo;

public class CreditUI {
    public void CreditCalculate(BaseCreditManager baseCreditManager) {
        System.out.println(baseCreditManager.getClass());
        baseCreditManager.Calculate();
    }
}
