package day30interfaces;

	/*
	 		1)"INTERFACE" IS NOT A CLASS
	 		2)"INTERFACE" CAN CONTAIN JUST "ABSTRACT" METHODS
	 			"abstract" class can contain both "concrete" and "abstract" method
	 		3)"abstract" class is a class, but interface is a nor class
	 		4)"interface" provides "fully abstraction" but "abstract classes" does not
	 		
	 		5)why do we need "interfaces" while we have "abstract classes"?
	 			Java does not support "multiple inheritance". It means a class cannot have multiple parents.
	 			But sometimes we need multiple parents because of that Java created "interfaces". 
	 		
	 		6)when do we use "interfaces"?
	 			a)when we need to create multiple parent for a class we use interfaces.
	 			b)"interfaces" are " to do list", if you want a child class to do sth,
	 			put them into an interface.
	 			
	 		7)	concrete Class==> Interface use "implements" keyword
	 			Interface Class==> Interface use "extends" keyword
	 			Interface Class==> Concrete Class is impossible
	 								because a Concrete Class cannot be the parent of an interface
	 		
	 		8)when a concrete class has multiple parent interfaces, the parent interfaces may have
	 			methods whose signatures are same and return types are same. It is allowed...
	 			
	 		Note:If you use different return types with same signature, it creates problem,
	 		you will get compile time error.
	 */

public interface I01 {

}
