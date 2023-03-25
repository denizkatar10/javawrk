package day24inheritanceoverriding;

public class Honda extends Car{
	
	public void factory() {
		System.out.println("Factory is in Japan");
	}
	/*
	 		Using "@Override" annotation is not must to achieve "overriding" but
	 		it has 2 benefits:  a) When you us"@Override" annotation Java checks
	 							overriding for you. If it is not correct, it gives
	 							you Compile Time Error
	 							b) When you use "@Override" annotation, it is
	 							god for readability.
	 		
	 		Note: "private" methods cannot e override.
	 		
	 		Note: Access modifiers of "overriding methods"(methods are in Child Class)
	 			  should be wider than or equal to the access modifiers of
	 			  "overridden methods"(Method are in Parent Class).
	 		
	 		Note: If return type is "primitive" or "void" in overriding, you cannot 
	 			  touch the return type
	 			  
	 		Note: If return type is "non-primitive", you should have "IS-A" relationship
	 */

	@Override
	public void move() {
		System.out.println("Honda reaches 100 in 6 seconds");
	}

	@Override
	public void engine() {
		System.out.println("Honda has a eco engine in every model");
	}

	@Override
	public int spend() {
		// TODO Auto-generated method stub
		return 22;
	}
	
	@Override
	public String speak() {
		return "Honda can speak in Japan";
	}

}
