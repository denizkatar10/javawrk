package day28exceptions;

public class Exc01 {
	
	/*
	 		1)"finally" is used in "try catch"
	 		2)"finally block" is executed under every condition
	 		3)"finally block" is used to end connection with cloud, to end connection with database
	 */

	public static void main(String[] args) {
		div(12,4);
		
	}
	
	public static void div(int a,int b) {
		
		try {
			
			System.out.println(a/b);
			
		}catch(ArithmeticException e){
			
			System.out.println("Do not use zero for the second parameter...");
			
		}finally {
			
			System.out.println("Do you want to do more operations...");
			
		}
	}

}
