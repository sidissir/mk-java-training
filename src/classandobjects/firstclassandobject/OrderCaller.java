package classandobjects.firstclassandobject;

public class OrderCaller {

	// calling class has main method => within the main method we create object of
	// Order class then use its state and behaviour
	public static void main(String[] args) {

		System.out.println("==================This is First object of Order class==================");

		// Creating object orderObj1 of Order class
		Order orderObj1 = new Order();

		// Access the state of the orderObj1 object

		System.out.println(orderObj1.productId);
		System.out.println(orderObj1.orderQuantity);
		System.out.println(orderObj1.eachProductPrice);
		System.out.println(orderObj1.tax);
		System.out.println(orderObj1.deliveryPostalCode);

		System.out.println("--------------------------------------------");

		// Access behaviour of the class
		orderObj1.makeAnOrderMethod();

		orderObj1.cancelAnOrderMethod();

		orderObj1.calculateTotalOrderPriceMethod();

		System.out.println("--------------------------------------------");

		System.out.println("==================This is second object of Order class==================");
		// Creating object orderObj1 of Order class

		Order orderObj2 = new Order();

		// Access the state of the orderObj1 object

		System.out.println(orderObj2.productId);
		System.out.println(orderObj2.orderQuantity);
		System.out.println(orderObj2.eachProductPrice);
		System.out.println(orderObj2.tax);
		System.out.println(orderObj2.deliveryPostalCode);

		System.out.println("--------------------------------------------");
		// Access behaviour of the class
		orderObj2.makeAnOrderMethod();

		orderObj2.cancelAnOrderMethod();

		orderObj2.calculateTotalOrderPriceMethod();

		System.out.println("--------------------------------------------");

		System.out.println("==================This is third object of Order class==================");
		// Creating object orderObj3 of Order class

		
		//Order orderObj3 = new Order();

		Order orderObj3; // Declaration

		orderObj3 = new Order(); // Using 'new' keyword is called instantiation // Order() Initialisation which
									// happens inside constructor
		
		


	}

}
