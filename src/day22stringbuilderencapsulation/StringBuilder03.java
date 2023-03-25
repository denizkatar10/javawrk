package day22stringbuilderencapsulation;

public class StringBuilder03 {
	
	public static void main(String[] args) {
		
		//String is Immutable, because of that when you want to update a String
		//JVM needs to many task like creating a new container, putting the update value
		//into it then remove the previous String object
		String str = "Java";
		str.concat("x");
		
		//StringBuffer is created yo update Strings easly but Java made the StringBuffer
		//tread-safe and synchronized but that made the StringBuffer slow. Then
		//Java created StringBuilder which is not thread-sade and not syncronized.
		//So it worked faster then StringBuffer.
		StringBuffer sbf = new StringBuffer("Java");
		sbf.insert(4, "x");
		System.out.println(sbf);//Javax 
		
		//As a result; if you are sure you will not need multi-threading just single 
		//threading is enough for you use StringBuilder when you need to update a String.
		//But if it is possible you will use multithreading use StringBuffer.
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(4, "X");
		System.out.println(sb);//JavaX
		
		
	}
	

}
