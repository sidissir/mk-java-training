package oops.abstraction.abstractexample;

public abstract class AbstractCar {

	// abstract class is a class with one or more abstract methods
	// Abstract method is a method which is just declared and doesn't have method
	// body
	// If method has body then that method is called as concrete method
	// Along with abstract methods, it may or may not have concrete methods
	// You can not create object for abstract class
	// Agreement between Abstract class and the class which is implementing
	// unimplemented methods present in abstract class

	// Member methods

	public void ignition() {
		System.out.println("Electric sparl plug ignition");
	}

	public void steering() {
		System.out.println("Power steering");
	}

	public abstract void transmission();

	public abstract void fuelType();

}
