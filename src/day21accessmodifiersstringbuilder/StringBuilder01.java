package day21accessmodifiersstringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		//How to create a String by using "StringBuilder Class"
		//1.Way:
		StringBuilder sb1 = new StringBuilder();
		//If you will add new characters constantly int you String use 1st way
		System.out.println(sb1);//Empty String
		
		System.out.println(sb1.capacity());//16 is the default capacity
		
		sb1.append("Ali Can");
		sb1.append(" is a student");
		
		System.out.println(sb1);//Ali Can is a student
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder("Veli Han is a parent");
		// If you will create an ordinary String use 2nd way
		System.out.println(sb2);
		
		
		//3.Way:
		StringBuilder sb3 = new StringBuilder(5);//length of the String
		// If you are sure about the length of the String use 3rd way
		sb3.append("Javaxx");
		
		System.out.println(sb3.capacity());//5 <== It returns the capacity of the StringBuilder field
		
		System.out.println(sb3.length());//4 <== It return s the number of characters
		
		// StringBuilder Methods
		
		StringBuilder sb4 = new StringBuilder("Java");
		StringBuilder sb5 = new StringBuilder("Java1299");
		
		// 1. User append() in method chain 
		sb4.append("x").append("y").append("z");
		System.out.println(sb4);// Javaxyz
		
		//2.
		sb4.append("$12.99",1, 6);//12.99// If you want to add some characters from a String use append() method like that.
		System.out.println(sb4);
		
		System.out.println(sb4.charAt(8));//2
		
		sb4.delete(4, 7);// String Class does not have that kind of method
		System.out.println(sb4);//Java12.99
		
		sb4.deleteCharAt(6);
		System.out.println(sb4);//Java1299
		
		sb4.insert(3, "CcC");// 3 is the starting index
		System.out.println(sb4);//JavCcCa1299
		
		sb4.insert(10, "Program", 1, 4);
		System.out.println(sb4);//JavCcCa129rog9
		
		sb4.replace(3, 9, "***");
		System.out.println(sb4);//Jav***9rog9
		
		// reverse() method is used to String
		sb5.reverse();
		System.out.println(sb5);//9921avaJ
		
		sb4.setCharAt(7, '0');
		System.out.println(sb4);//Jav***90og9
		
		
		System.out.println(sb4.subSequence(3, 6));//***
		
		sb4.trimToSize();// Attempts to reduce storage used for the character sequence.
		

	}

}