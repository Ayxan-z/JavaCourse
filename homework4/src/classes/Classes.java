package classes;
public class Classes {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();

        int n1 = 1;
        int n2 = 2;
        n1 = n2;
        n2 = 3;
        System.out.println(n1);

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        a1 = a2;
        a2[0] = 7;
        System.out.println(a1[0]);
    }
}
