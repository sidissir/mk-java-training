package oops.inheritance;

public class Father extends GrandFather{

	// Variables
	int fatherAge = 50 ;
	int fatherEarnings = 2000000;
	
	
	//methods
	public void getFatherEarnings() {
		System.out.println("Father Earnings are :" + fatherEarnings);
	}
	
	public void getFatherTotalEarnings() {
		int fatherTotalEarnings;
		fatherTotalEarnings = fatherEarnings + grandFatherEarnings;
		System.out.println("Father Total Earnings are :" + fatherTotalEarnings);
				
	}
	
	
	public static void main(String[] args) {
		
		Father father = new Father();
		System.out.println(father.fatherAge);
		System.out.println(father.fatherEarnings);
		father.getFatherEarnings();
		father.getFatherTotalEarnings();
		System.out.println(father.grandFatherAge);
		father.getGrandFatherEarnings();
		
	}
	
}
