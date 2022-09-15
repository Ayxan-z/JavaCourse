package homework2;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 28;
		int total = 1; 
		
		for (int i=2; i<=number/2; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number + " is perfect number");
		}else {
			System.out.println(number + " isn't perfect number");
		}
	}

}
