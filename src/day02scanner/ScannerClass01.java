package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first integer");
		
		int num1 = scan.nextInt();
		
		System.out.println(num1);
		
		System.out.println("second");
		
		int num2 = scan.nextInt();
		
		System.out.println(num1 + num2);
		
		
		
		
	}

}
