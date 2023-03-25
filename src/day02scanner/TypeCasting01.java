package day02scanner;

public class TypeCasting01 {
	
	public static void main(String[] args) {
		
		/*
		 	byte< short < int < long < float < double
		*/
		
		// Auto Widening: If you assign a small data to a large data type' type casting
		//				  is done automatically by Java.
		//				  This process is called "Auto Widening"
		
		byte b1 = 112;
		
		int i1 = b1;
		
		System.out.println(b1);
		System.out.println(i1);
		
		// Explicit Narrowing: If you assign a large data type to a small data type,
		//						type casting cannot be done by Java automatically.
		//						This process is called "Explicit Narrowing"
		
		int i2 = 120;
		short s1 = (short)i2;
		System.out.println(i2);
		System.out.println(s1);
		
		// When you type "float f1 = 2.3;", it will be complain.
		// To fix that issue, you have 3 options;
		
		float f1 = 2.3f;
		float f2 = (float) 2.3;
		double f4 = 2.3;
		
		
		// If you use "Explicit Narrowing" with the numbers which are not in the interval
		// then you will get different results. The result will be calculated according 
		// to the modulus operation.
		short s2 = 255;
		byte b4 = (byte) s2;
		System.out.println(s2);//255
		System.out.println(b4);//-1
		
		int i3 = 5;
		int i4 = 2;
		
		System.out.println(i3 / i4); // result will be 2 because int/int=int for Java
		
		int i5 = 5;
		double d1 = 2;
		
		System.out.println(i5 / d1);//2.5 if you use different data type Java choosing big 
		//	largest data type.
		
		
		
	}

}
