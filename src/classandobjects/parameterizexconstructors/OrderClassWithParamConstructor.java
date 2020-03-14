package classandobjects.parameterizexconstructors;

public class OrderClassWithParamConstructor {

	// State / Member Variables / Instance Variables

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;

	// We pass inital values from calling program
	OrderClassWithParamConstructor(int orderIdfromCaller, int productIdFromCaller, int orderQuantityFromCaller,
			double eachProductPriceFromCaller, double taxFromCaller, String deliveryPostalCodeFromCaller,
			String orderTimeStampFromCaller) {
		orderId = orderIdfromCaller;
		productId = productIdFromCaller;
		orderQuantity = orderQuantityFromCaller;
		eachProductPrice = eachProductPriceFromCaller;
		tax = taxFromCaller;
		deliveryPostalCode = deliveryPostalCodeFromCaller;
		orderTimeStamp = orderTimeStampFromCaller;
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
