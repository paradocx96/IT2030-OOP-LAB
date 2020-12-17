package lab1.Ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int x = input.nextInt();
		
		if(x > 18){
			System.out.println("Adult");
		} else {
			System.out.println("Child");
		}
	}

}
