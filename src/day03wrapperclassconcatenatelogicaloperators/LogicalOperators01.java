package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators01 {
	
	/*
	 * Operators in Java
	 *	1) = is assignment operator
	 * 	Gets the calues from roght and puts it into container on the left
	 * 	For example; int s = 12;
	 * 	
	 * 	2) == is equal sign in Java
	 * 	5 == 2+3
	 * 	If left part equals to right part, it returns "true	
		, otherwise it return false
		
		3) != means not equal
		   != return boolean.
			If left part not equals to right part; it returns "ture", otherwise return false
			
		4) > means greater then
			> returns boolean.
			
		5)	< means less than
			< returns true
			
		6)	>= means than or equal to
			>= returns boolean
			
		7)	<= means less than or equal
			<= returns boolean
			
		8)	&& AND operator
			&& returns true if everything is true
			
		9)	|| OR operator 
			|| returns false if everything is false
			
		10)	& AND operator
			& returns true if everything is true
	 */

	public static void main(String[] args) {
		
		System.out.println(5 == 2+3);//true
		System.out.println(5 != 2+4);//true
		System.out.println(5 > 13);//false
		System.out.println(5 >= 5);// true
		System.out.println((5 < 7) && (3 > 1));//true
		
		// What is the difference between && and &,
		System.out.println((5 > 7) & (3 > 1) & (4 == 4));//false
		
	}

}
