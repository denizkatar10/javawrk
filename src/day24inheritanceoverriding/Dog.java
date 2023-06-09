package day24inheritanceoverriding;

public class Dog extends Mammal{
	
	public boolean smellWell; 
	
	

	public Dog() {
		super(); //If you type "super()" it is fine,
			  	 //if you do not type Java puts it automatically
		System.out.println("Dog constructor without parameter");
	}
	
	public Dog(boolean smellWell) {
		super(true);
		//If you do not type any parent constructor call inside the first line
		//Java uses the parent constructor without parameter automatically
		
		/*
		 	super() is for "parent constructor call"
		 	"super" is for "parent variables call"
		 */
		super.haveBaby = true;
		super.height = 11;
		super.weight = 22;
		
		//super.height;==> returns the height value from parent classes (Animal)
		//this.height; ==> return the height value from the class itself(Dog)
		
		
		this.smellWell = smellWell;
	}
	
}
