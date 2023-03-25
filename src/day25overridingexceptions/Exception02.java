package day25overridingexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception02 {
	
	/*
	 		1)Exceptions are unexpected errors in Java
	 		2)Exceptions can handle by using try-catch blocks
	 		3)ArithmeticException is thrown by Java in RunTime if there is any issue in Mathematical Operations.
	 		4)FileNotFoundException occurs in Compile Time, if there is a any issue in the Path of the file or in the
	 		existence of the file
	 */

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("Users\\Mr Deniz\\eclipse-workspace\\winterjava\\src\\day25overridingexceptions\\fileForExc");
		}catch(FileNotFoundException e){
			System.out.println("asdasdasd");
		}
		
		

	}

}
