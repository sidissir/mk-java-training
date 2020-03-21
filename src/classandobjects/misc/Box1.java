package classandobjects.misc;

public class Box1 {


	// Variables
	String size;
	String color;
	double price;
	String sponsorName;

	// Constructor
	Box1(String sizeFromCaller, String colorFromCaller, double priceFromCaller, String sponsorNameFromCaller) {
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
		System.out.println("Thanks for your Box : " + sponsorName);
	}
	
	public void myReview() {
		sayThanks();
		
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
		
		Box1 bfastBox = new Box1("Large", "green", 3.50, "Prashanthi");

		System.out.println(bfastBox.sponsorName);
		//bfastBox.sayThanks();
		bfastBox.myReview();
		
		System.out.println("*****************************************************");
		Box1 lunchBox = new Box1("Medium", "Red", 7.12, "Ramya");
		System.out.println(lunchBox.sponsorName);
		//lunchBox.sayThanks();
		lunchBox.myReview();
		
		
		System.out.println("*****************************************************");

		Box1 dinnerBox = new Box1("Small","Blue",1.12,"Raji");
		System.out.println(dinnerBox.sponsorName);
		//dinnerBox.sayThanks();
		dinnerBox.myReview();
		
		
	}


}
