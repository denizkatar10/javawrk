package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {
	
	/*
	 * Hint 1: Area of square is lenght x lenght
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Put the lenght for square");
		
		double length = scan.nextDouble();
		
		System.out.println("Area: " + length * length);
		
		
		
	}
 }
