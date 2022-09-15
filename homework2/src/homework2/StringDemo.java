package homework2;

public class StringDemo {

	public static void main(String[] args) {
		String text = "messaGe ";

		System.out.println(text.length());
		System.out.println(text.charAt(4));
		System.out.println(text.concat(" test"));
		System.out.println(text.startsWith("m"));
		System.out.println(text.endsWith("e"));
	
		char[] charArray = new char[5];
		text.getChars(1, 6, charArray, 0);
		System.out.println(charArray);

		System.out.println(text.indexOf('s'));
		System.out.println(text.indexOf("ss"));
		System.out.println(text.lastIndexOf('s'));
		System.out.println(text.lastIndexOf("ss"));

		System.out.println(text.replace('s', '-'));
		System.out.println(text.substring(2, 4));
		System.out.println(text.split("s")[2]);
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(text.trim());
	}

}
