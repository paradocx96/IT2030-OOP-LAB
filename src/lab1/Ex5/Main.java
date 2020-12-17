package lab1.Ex5;

public class Main {

	public static void main(String[] args) {

		int c = 1;
		while (c <= 5) {
			int i = 1;
			System.out.print(" ");
			while (i <= 5) {
				System.out.print("*");
				System.out.print(" ");
				i++;
			}
			c++;
			System.out.println(" ");
		}

		System.out.println("\n");
		
		for (int x = 1; x < 6; x++) {
			for (int y = 1; y <= 6 - x; y++) {
				System.out.print(" ");
			}
			for (int z = 1; z <= x; z++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
