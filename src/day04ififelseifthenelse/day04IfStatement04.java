package day04ififelseifthenelse;

import java.util.Scanner;

public class day04IfStatement04 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter the value of length and width of a rectangle,
		 * then check if it is square or not.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere width and length of the square");
		double width = scan.nextDouble();
		double length =  scan.nextDouble();
		
		if(width <=0 || length <=0) {
			System.out.println("Enter valid values");
		}else{
			if(width == length) {
				System.out.println("Square");
			}else { 
				System.out.println("Rectangle");
			}
		}
	}
}