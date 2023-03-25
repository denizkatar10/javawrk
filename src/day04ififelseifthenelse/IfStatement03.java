package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 * Get the name of the day from user.
		 * Type java code by using if statement
		 * When you enter the name of the day of a week,
		 * Output will be "Weekday" or "Weekend day" according to the name of the day.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the day of a week");
		String name = scan.next().toUpperCase();
		
		//Note: to compare String, DONT USE "==". Use "equal()" method
		// "Ali.equals("Veli"); ==> false
		// "Ali.equals("Ali"); ==> true
		// "Ali.equals("ali"); ==> false
		
		if( name.equals("MONDAY") || name.equals("TUESDAY")|| 
			name.equals("WEDNESDAY") ||
			name.equals("THURSDAY") || name.equals("FRIDAY")) {
			System.out.println("Weekday");
		}
		if(name.equals("SATURDAY") || name.equals("SUNDAY")) {
				System.out.println("Weekend day");
			}else {
			System.out.println("Please enter a day name");
		}
		

	}

}
