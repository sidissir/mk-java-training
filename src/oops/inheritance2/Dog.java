package oops.inheritance2;

public class Dog extends Animal{

	//Methods
	/*
	 * public void eat() { System.out.println("I can eat"); }
	 * 
	 * public void walk() { System.out.println("I can walk"); }
	 * 
	 * public void sleep() { System.out.println("I can sleep"); }
	 */
		public void bark() {
			System.out.println("I can bark");
		}
		
		
		public static void main(String[] args) {
			Dog dog1 = new Dog();
			
			
			dog1.eat();
			dog1.walk();
			dog1.bark();
			dog1.sleep();
			
		}
		
}
