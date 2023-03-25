package day04ififelseifthenelse;

import java.util.Scanner;

public class day04IfElseStatement01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere width and length of the square");
		double width = scan.nextDouble();
		double length =  scan.nextDouble();
		
		if(width <=0 || length <=0) {
			System.out.println("Enter valid values");
		}
		if(width == length) {
			System.out.println("Square");
		}
		if(width != length) {
			System.out.println("Rectangle");
		}

		
		
	}

}
