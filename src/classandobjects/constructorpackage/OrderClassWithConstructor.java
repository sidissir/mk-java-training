package classandobjects.constructorpackage;

public class OrderClassWithConstructor {

	// State / Member Variables / Instance Variables

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;

	// Constructor is a method whose name is same as class name
	// Constructior is used to initialize all the member variables present in the class
	OrderClassWithConstructor() {
		orderId = 23;
		productId = 1;
		orderQuantity = 5;
		eachProductPrice = 12.5;
		tax = 0.25;
		deliveryPostalCode = "MK44TL";
		orderTimeStamp = "2020-01-01 23:34:21";
	}

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
		System.out.println((orderQuantity * eachProductPrice) + tax);
	}

}
