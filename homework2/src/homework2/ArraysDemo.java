package homework2;

public class ArraysDemo {

	public static void main(String[] args) {
		char[] students = new char[3];
		students[0] = 'a';
		students[1] = 'b';
		students[2] = 'c';
		
		for (int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		for (char student: students) {
			System.out.println(student);
		}
		
		double[] myList = {1.2, 23, 3.5};
		double total = 0;
		double max = myList[0];
		for (double number: myList) {
			total += number;
			if (max < number) {
				max = number;
			}
		}
		System.out.println(total);
		System.out.println(max);
	}

}
