package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		
		char firstNameInitial = scan.next().charAt(0);
		
		System.out.println("Enter your last name: ");
		
		char lastName = scan.next().charAt(0);
		
		
		System.out.println("Initial of the first name: " + firstNameInitial);
		
		System.out.println("Initial of the last name: " + lastName);
		
		/*
		 *  If you use mathematical operations for chars, Java Uses the ASCII values of chars.
		 *  If you want toprint chars on the as characters not ASCII values you have 2 option;
		 *  1) Use String together with chars.
		 *  2) Use System.out.print()
		 *  
		 *  Note: System.out.println() prints the output then goes to the next line.
		 */
		
		System.out.println("" + firstNameInitial + lastName);
		System.out.print(firstNameInitial);
		System.out.print(lastName);
		
		
	}

}
