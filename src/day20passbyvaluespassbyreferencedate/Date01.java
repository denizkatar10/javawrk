package day20passbyvaluespassbyreferencedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		
		//How to creat date object
		LocalDate currentDate1 = LocalDate.now();
		System.out.println(currentDate1);//2021-03-14
		
		System.out.println(currentDate1.plusDays(5));//2021-03-19
		
		System.out.println(currentDate1.plusMonths(3));//2021-06-14
		
		System.out.println(currentDate1.plusDays(3).plusMonths(2).plusYears(1));//2022-05-17
		
		System.out.println(currentDate1.getDayOfYear());//73 day of the year :D
		
		System.out.println(currentDate1.isAfter(currentDate1));//false
		
		//How to create time object
		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);//23:18:07.596116500
		
		System.out.println(currentTime1.plusMinutes(11));
		
		System.out.println(currentTime1.now(ZoneId.of("Turkey")));
		
		
		//How to create an object from LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.now();
		
		System.out.println(dateTime1);
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd");//M=>Months. m=>Minute
																		  //MMM=>First 3 characters
																		  //MM=> The number of the month
																		  //MMMM=> Full month name
		System.out.println(dtf2.format(currentDate2));//21/Mar/14
		
		
		//hh==> is for am-pm time format
		//HH==> IS FOR 24 HOURS SYSTEM
		
		//How to find difference between two dates
		LocalDate d1 = LocalDate.now();
		
		LocalDate bd1 = LocalDate.of(1997, 5, 23);
		
		//If you want to get year, mothn, and day in age use the below code
		Period age =Period.between(d1, bd1);
		System.out.println(age);
		
		//If you want to get just year in age use the following code
		int ageyear = Period.between(bd1, d1).getYears();
		System.out.println(ageyear);//23
		
		
		
	}

}
