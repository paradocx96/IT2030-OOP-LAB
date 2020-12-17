package lab1.Ex7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int x = input.nextInt();
		System.out.print("Enter First Number : ");
		int y = input.nextInt();
		
		System.out.println("Sum of 2 numbers : " + (x+y));
		System.out.println("Avarage of 2 numbers : " + (x+y)/2);
	}

}
