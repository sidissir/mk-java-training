package classandobjects.firstclassandobject;

public class Order {

//Class is equivalent to building plan
	
	// State / Member Variables / Instance Variables

	int productId = 1;
	int orderQuantity = 3;
	double eachProductPrice = 10.34;
	double tax = 0.25;
	String deliveryPostalCode = "MK44TL";

	// Behaviour / Member methods / Instance Methods
	public void makeAnOrderMethod() {
		System.out.println("I have ordered lunch box");
	}
	
	public void cancelAnOrderMethod() {
		System.out.println("I am cancelling Lunch box");
	}
	
	public void returnAnOrderMethod() {
		System.out.println("I am returning this order beacuse its defective");
	}
	
	public void calculateTotalOrderPriceMethod() {
		System.out.println((orderQuantity*eachProductPrice) + tax);
	}

}
