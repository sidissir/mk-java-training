package oops.polymorphism.overriding;

public class Dog extends Animal {

	// When there is same method present in both parent and child classes, then
	// method present in child class overrides method present in parent class

	// Member variables

	// Constructor

	// Member Methods

	public void eat() {
		System.out.println("Inside Dog Class : Dog is eating");
	}
	
	public void eat(String dogBreed) {
		System.out.println("Inside Dog Class : Dog is eating : " + dogBreed );
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog();

		dog1.eat();
		
		dog1.eat("Bull Dog ");

	}
}
