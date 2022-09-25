package method_overloading;

public class Main {
    public static void main(String[] args) {
        FourTransactions fourTransactions = new FourTransactions();
        System.out.println(fourTransactions.Sum(3, 9));
        System.out.println(fourTransactions.Sum(3, 9, 10));
    }
}
