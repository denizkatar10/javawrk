package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Put length");
		
		double length = scan.nextDouble();
		
		System.out.println("Put width");
		
		double width = scan.nextDouble();
		
		System.out.println("Area: " + width * length);
		System.out.println("Perimeter: " + (2*(width + length)));
		
		
	}

}
