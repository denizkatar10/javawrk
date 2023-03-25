package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Give your name and last name: ");
		
		// If you want to get a String data from user, usenextLine() method
		
		//nextLine() method gets full String which user entered
		
		String fullName = scan.nextLine();
		
		System.out.println(fullName);
		
		System.out.println("Enter your kids first name");
		
		String kidFirstName = scan.next();
		
		System.out.println(kidFirstName);
		
		
		
	}
}
