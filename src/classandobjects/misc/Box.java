package classandobjects.misc;

public class Box {

	// Variables
	String size;
	String color;
	double price;
	String sponsorName;

	// Constructor
	Box(String sizeFromCaller, String colorFromCaller, double priceFromCaller, String sponsorNameFromCaller) {
		size = sizeFromCaller;
		color = colorFromCaller;
		price = priceFromCaller;
		sponsorName = sponsorNameFromCaller;

	}

	// methods
	public void getPrice() {
		System.out.println("price is :" + price);
	}

	public void sayThanks() {
		System.out.println("Thanks for your LunchBox : " + sponsorName);
	}
	
	public void myReview() {
		if(price< 3) {
			System.out.println("I am sad");
		}
		
		if(price>3 && price<7) {
			System.out.println("I am Ok");
		}
		
		if(price>7) {
			System.out.println("I am like WOW");
		}
		
		
	}

	// Main method
	public static void main(String[] args) {
		
		Box bfastBox = new Box("Large", "green", 3.50, "Prashanthi");

		System.out.println(bfastBox.sponsorName);
		bfastBox.sayThanks();
		bfastBox.myReview();
		
		System.out.println("*****************************************************");
		Box lunchBox = new Box("Medium", "Red", 7.12, "Ramya");
		System.out.println(lunchBox.sponsorName);
		lunchBox.sayThanks();
		lunchBox.myReview();
		
		
		System.out.println("*****************************************************");

		Box dinnerBox = new Box("Small","Blue",1.12,"Raji");
		System.out.println(dinnerBox.sponsorName);
		dinnerBox.sayThanks();
		dinnerBox.myReview();
		
		
	}

}
