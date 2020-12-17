package lab2.Ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int length, width, height;

		System.out.print("Enter Length : ");
		length = Integer.parseInt(bufferedReader.readLine());

		System.out.print("Enter Width : ");
		width = Integer.parseInt(bufferedReader.readLine());

		System.out.print("Enter Height : ");
		height = Integer.parseInt(bufferedReader.readLine());

		System.out.println("Volume : " + (length * width * height));
	}
}
