package javaDayFourOOPS.classObjects;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String stringValue = scanner.nextLine();
		System.out.println(stringValue);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		System.out.println(number);
		
		
				
	}

}
