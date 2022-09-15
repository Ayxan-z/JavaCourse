package homework2;

public class Vowels {

	public static void main(String[] args) {
		char character = 'H';
		
		switch (character) {
			case 'A':
			case 'O':
			case 'U':
			case 'I':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
		}
	}

}
