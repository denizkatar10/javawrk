package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {

		/*
		 * Concatenation: Joining Strings
		 */
	
	public static void main(String[] args) {
		
		String s1 = "Ali";
		String s2 = "Can";
		System.out.println(s1 + " " + s2);

		int a = 5;
		int b = 7;
		String s3 = "Java";
		System.out.println(a + " " + s3);// "5 Java"
		
		System.out.println(a + b);//12
		
		System.out.println(a + s3 + b);//5Java7
		
		System.out.println(a + b + s3);//12Java
		System.out.println(s3 + a*b);//Java35
		
		//By using following variables, print 61 Study-1 on the console
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		
		System.out.println(numA*numB + "" + (numB-numA) + " " + str1 + (numA-numB));
		
		
		
	}

}
