package homework2;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 3;
		
		if (number == 1) {
			System.out.println("Number is prime: false");
		}else if (number < 1) {
			System.out.println("Number is wrong");
		}
		else {
			boolean isPrimeNumber = true;
			for (int i=2; i<=25/2; i++) {
				if (number % 2 == 0) {
					isPrimeNumber = false;
				}
			}
			System.out.println("Number is prime: " + isPrimeNumber);
		}
	}

}
