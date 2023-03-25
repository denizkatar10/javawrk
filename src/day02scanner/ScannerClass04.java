package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Prism Length");
		
		double length = scan.nextDouble();
		
		System.out.println("Prism Width ");
		
		double width = scan.nextDouble();
		
		System.out.println("Prism height");
		
		double height = scan.nextDouble();
		
		double volume = length * width * height;
		
		System.out.println("Volume of the Prism = " + volume);
	
		
		
		
	}

}
