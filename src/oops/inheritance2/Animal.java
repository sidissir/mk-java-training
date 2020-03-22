package oops.inheritance2;

public class Animal {
	
	//Methods
	public void eat() {
		System.out.println("I can eat");
	}
	
	public void walk() {
		System.out.println("I can walk");
	}
	
	public void sleep() {
		System.out.println("I can sleep");
	}
	
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.eat();
		animal1.walk();
		animal1.sleep();
	}

}
