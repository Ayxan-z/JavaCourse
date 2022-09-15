package homework2;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] cities = {
				{"a", "b", "c"},
				{"d", "e", "f"}
		};

		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}
