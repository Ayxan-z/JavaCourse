package homework2;

public class FindingNumbers {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,4,5,6};
		int number =5;
		boolean numberIsExists = false;

		for (int n: numbers) {
			if (n == number) {
				numberIsExists = true;
				break;
			}
		}
		System.out.println(numberIsExists);
	}

}
