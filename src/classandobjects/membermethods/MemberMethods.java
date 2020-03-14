package classandobjects.membermethods;

public class MemberMethods {

	// State / Member Variables / Instance Variables

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;
	
	
	//Hard coded Constructor
	MemberMethods() {
		orderId = 23;
		productId = 1;
		orderQuantity = 5;
		eachProductPrice = 12.5;
		tax = 0.25;
		deliveryPostalCode = "MK44TL";
		orderTimeStamp = "2020-01-01 23:34:21";
	}

	
	//Begaviour
	
	//This method dont return any value
	//Not taking any parameters
	public void makeAnOrderMethod() {
		System.out.println("I have ordered lunch box");
	}

	// This method is returning a double value and not taking any parameters
	public double returnTotalOrderPriceMethod() {
		// 9 * 2.65 + 0.25 =
		return (orderQuantity * eachProductPrice) + tax;
	}

	// This method is returning String value and not taking any parameters
	public String returnFullAddress() {
		// 9 * 2.65 + 0.25 =
		return "6 CAGNEY CRESCENT ,OXLEY PARK,MK";
	}

	//This method is returning double and taking one parameter
	public double calculatedFinalPriceAfterDisc(double discountFromCaller) {
		double totalPriceBeforeDisc = (orderQuantity * eachProductPrice) + tax;
		double totalPriceafterDisc = totalPriceBeforeDisc - discountFromCaller;
		return totalPriceafterDisc;
	}

	//This method is returning double value and taking two parameters
	public double calculatedFinalPriceAfterGenderDisc(double discountFromCaller, double genderDiscount) {
		double totalPriceBeforeDisc = (orderQuantity * eachProductPrice) + tax;
		double totalPriceafterDisc = totalPriceBeforeDisc - discountFromCaller - genderDiscount;
		return totalPriceafterDisc;
	}

}
