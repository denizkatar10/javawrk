package day23encapsulationinheritance;

public class Runner {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.bark(); // dog1 inherited bark() method from Animal Class
		dog1.drink();// dog1 inherited drink() method from Animal Class
		dog1.eat();// dog1 inherited deat() method from Animal Class

	}

}
