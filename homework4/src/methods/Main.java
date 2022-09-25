package methods;

public class Main {
    public static void main(String[] args) {
        // testFunc();
        // System.out.println(sum(3, 9));
        System.out.println((sumNums(1, 2, -2)));
    }

    public static void testFunc() {
        System.out.println("Test");
        return;
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sumNums(int... nums) {
        int numsSum = 0;
        for (int num: nums) {
            numsSum += num;
        }
        return numsSum;
    }
}
