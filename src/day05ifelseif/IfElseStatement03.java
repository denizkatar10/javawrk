package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement03 {

	/*
	 	Ask user to enter any name of the days, then get second, fourth, and
	 	sixth letters of the day name and print them on the console in the same line.
	 	For example; if the user enters "Monday" output will be "ody"
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name of a day");
		String dayName = scan.next();
		
		if((dayName.equalsIgnoreCase("MondaY")) || (dayName.equalsIgnoreCase("tUESDAY"))
		|| (dayName.equalsIgnoreCase("WEDNESDAy")) || 
		(dayName.equalsIgnoreCase("thursday")) || (dayName.equalsIgnoreCase("friday"))) {

			System.out.print(dayName.charAt(1));
			System.out.print(dayName.charAt(3));
			System.out.println(dayName.charAt(5));
			
		}else {
			System.out.println("Enter a valid day name");
		}
		
		
		
	}

}
