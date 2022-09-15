package homework2;

public class Conditionals {

	public static void main(String[] args) {
		int number = 13;

		if (number == 12) {
			System.out.println(number + " == 12");
		}else if (number > 12) {
			System.out.println(number + " > 12");
		}else {
			System.out.println(number + " < 12");
		}
		
		int n1 = 4;
		int n2 = 2;
		int n3 = 8;
		int maxN = n1;
		
		if (maxN < n2) {
			maxN = n2;
		}
		if (maxN < n3) {
			maxN = n3;
		}
		System.out.println("max value: " + maxN);

		char grade = 'B';
		switch (grade) {
			case 'A':
				System.out.println("100");
				break;
			case 'B':
				System.out.println("90");
				break;
			case 'C':
				System.out.println("80");
				break;
			case 'D':
				System.out.println("70");
				break;
			case 'F':
				System.out.println("60");
				break;
			default:
				System.out.println("grade type wrong");
				
		}
	}

}
