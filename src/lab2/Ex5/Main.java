package lab2.Ex5;

public class Main {

	public static void main(String[] args) {
		
		EvenOddNumber input = new EvenOddNumber();
		
		boolean result = input.findEvenOrOdd(7);
		
		if (result == true) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

}
