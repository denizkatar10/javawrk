package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Full Name: ");
		
		String fullName = scan.nextLine();
		
		System.out.println("Just First Name: ");
		
		String firstName = scan.next();
		
		scan.nextLine();
		
		System.out.println("Put your adress: ");
		
		String adress = scan.nextLine();
		
		System.out.println("Your Full name: " + fullName + "First Name: " + firstName + " Your Adress: " + adress);
		
	}

}
