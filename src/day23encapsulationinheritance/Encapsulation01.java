package day23encapsulationinheritance;

public class Encapsulation01 {
	
	private String name = "Ali Can";
	private int age = 21;
	private boolean retired = false;
	
	private char initial = 'A';
	private String adress = "Miami Florida";
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//void is used a)When you print sth on the console b)When you do just an action
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//For getters of boolean variables start the name of getter with "is"
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	
	
	//To Make "initial" variable just readable, you should not create "setter",
	//create just "getter".
	}
	public char getInitial() {
		return initial;
	}
	
	//Make "adress" just updatable, you should not create "getter", you should
	// create "setter".
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/*
	 	If you wantnot to update any value, you do not create any setter method.
	 	If you do not create any setter method it means no value can be updated, and
	 	the class is called non-mutable.
	 	
	 	Exp==> How can you make a class "immutable class"?
	 	answer==> Make all variables private then do not create any setter method
	 */

}
