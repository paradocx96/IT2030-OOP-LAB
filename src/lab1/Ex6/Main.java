package lab1.Ex6;

public class Main {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 5; x++) {
			
			for (int y = 1; y <= 5; y++) {
				System.out.print("*");
				System.out.print(" ");
			}

			System.out.print("  ");

			for (int z = 1; z <= 5 - x; z++) {
				System.out.print(" ");
			}

			for (int w = 1; w <= x; w++) {
				System.out.print("*");
				System.out.print(" ");
			}

			System.out.println("");

		}

	}

}
