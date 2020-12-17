package lab2.Ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int length = input.nextInt();
		
		System.out.print("Enter Width : ");
		int width = input.nextInt();
		
		System.out.print("Enter Height : ");
		int height = input.nextInt();
		
		
		System.out.println("Volume : " + (length*width*height));

	}

}
