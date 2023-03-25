package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {

	/*
	 * 		Ask user to enter 3 digit integer.
	 * 		Type a program to find the sum of the digits
	 * 		For example: 438 ==> 4+3+8+ = 15;
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me a 3 digit integer: ");
		int a = scan.nextInt();
		System.out.println(a);
		
		int lastDigit = a % 10;
		
		int num1 = a/10;
		int secondDigit = num1 % 10;
		int firstDigit = a / 100;
		
		System.out.println(firstDigit + secondDigit + lastDigit);

	}

}
