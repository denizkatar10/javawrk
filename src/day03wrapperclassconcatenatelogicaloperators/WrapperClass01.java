package day03wrapperclassconcatenatelogicaloperators;

public class WrapperClass01 {
	
	public static void main(String[] args) {
		
		/*
		 * 	Wrapper Class: Java created some objects whose values are coming from
		 * 				   primitive data types but the objects have methods as well
		 * 	Wrapper Class for boolean ==> Boolean
		 * Wrapper Class for char ==> Character
		 * Wrapper Class for byte ==> Byte
		 * Wrapper Class for short ==> Short
		 * Wrapper Class for int ==> Integer
		 * Wrapper Class for long ==> Long
		 * Wrapper Class for float ==> Float
		 * Wrapper Class for double ==> Double
		 */
		
		Integer i = 12;
		Boolean b = true;
		Byte byteMin = Byte.MIN_VALUE;
		System.out.println(byteMin);
		Byte byteMax = Byte.MAX_VALUE;
		System.out.println(byteMax);
		
		
		//Find the min and max values of short data type
		Short shortMax = Short.MAX_VALUE;
		Short shortMin = Short.MIN_VALUE;
		System.out.println(shortMax + " " + shortMin);
		
		
	}

}
