package day30interfaces;

	/*
	 		1)all methods in an interface must be abstract
	 			putting "abstract" keyword or not puttuing "abstract" keyword are same.
	 			
	 		2)all methods in an interface must be public
	 			putting "public" keyword or not putting "public" keyword are same.
	 			In an interface, if you do noy see "access modifier" for a method,
	 			it is public not default.
	 			
	 		3)In an interface, Variables in an interface are "public", "static" and "final" as default.
	 			no need to type "public", "static" and "final" for variables.
	 		
	 		4) In interface, we have uncompleted methods(abstract methods) because of that Java does not
	 			let us to create objects by using interfaces.
	 			Because of the same reason, we cannot create objects by using abstract classes
	 			Note: interfaces do not have constructors.
	 					abstract classes have constructors but constructors are not used to create objects
	 			
	 */

public interface Sound {
	
	//Methods are public and abstract in an interface
	
	public abstract void sound();
	public void increaseVolume();
	
	//protected void decreaseVolume();// we can not use private and protected
	void decreaseVolume();
	
	//Variables in an interface are "public", "static" and "final"
	public static final int LEVEL = 12;
	
	 int PRICE = 12;
	
}
