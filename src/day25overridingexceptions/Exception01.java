package day25overridingexceptions;

public class Exception01 {

	public static void main(String[] args) {
		
		System.out.println(divide(6,2));//3.0
		System.out.println(divide(2,6));//0.33
		System.out.println(divide(-3,12));//-0.25
		System.out.println(divide(0,6));//0.0
		System.out.println(divide(2,0));//Run Time Exception

	}
	
	public static int divide (int a, int b) {
		
		int result = 0;
		try {
			return a / b;			
		}catch(ArithmeticException e){
			System.out.println("Do not use zero for denomination");
		}
		return result;
	}

}
