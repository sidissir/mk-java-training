package oops.abstraction.abstractexample;

public class AurisHybridAutomatc extends AbstractCar {

	public void transmission() {
		System.out.println("I am Auris Automatic varient ");
	}

	public void fuelType() {
		System.out.println("I am Auris Hybrid varient ");

	}
	
	
	public static void main(String[] args) {
		//You can not create object for abstract class as shown below 
		//AbstractCar obj1 =  new AbstractCar();
		
		//Two ways in which we can create objects
		AurisHybridAutomatc rajiCar = new AurisHybridAutomatc();

		AbstractCar rajiCar1 = new AurisHybridAutomatc();
	}

	

}
