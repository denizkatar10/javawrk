package day24inheritanceoverriding;

public class Audi extends Car{
	
	/*
	 		1)If you change the "method body" of a method which is in parent class
	 		before using in Child Class, it is "method overriding"
	 		2)In method overriding we do not create a new method, we change the 
	 		implementation and use it.
	 		3)In "method overriding" you can not change "method name"
	 		you cannot change "method parameters".
	 		Note: Method name + Method Parameter is called Method Signature.
	 			  So, we do not change "method signature" in method overriding.
	 */
	
	public void price() {
		System.out.println("Audi is expensive");
	}

	@Override
	public void move() {
		System.out.println("Audi moves very fast...");
		super.move();
	}

	

}
