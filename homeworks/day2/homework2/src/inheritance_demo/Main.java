package inheritance_demo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        AgriculturalCreditManager agriculturalCreditManager = new AgriculturalCreditManager();
        creditUI.CreditCalculate(teacherCreditManager);
        creditUI.CreditCalculate(agriculturalCreditManager);
    }
}
