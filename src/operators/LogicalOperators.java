package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		
		// Logical Operators
		
		//&&
		
		
		int a = 10;
		int b= 15;
		int c= 5;
		
		if(a>b && a>c) {
			System.out.println("a is greatest of all");
		} 
		
		
		if(b>c && b>a) {
			System.out.println("b is greatest of all");
		}
		
		
		if(c>a && c>b) {
			System.out.println("c is greatest of all");
		}
		
		
		// ||
		
		char gender = 'F';
		int age = 23;
		
		
		if((gender=='M' || gender == 'F') && (age>=13 && age <=19)) {
			System.out.println("Teenager");
		}else {
			System.out.println("Not Teenager");
		}
		
		
		//!  boolean values
		
		
		boolean isMale = true;
		
		if(isMale) {
			System.out.println("Male");
		}else {
			System.out.println("Female");
		}
		
		
		if(!isMale) {
			System.out.println("Female");
		}else {
			System.out.println("Male");
		}
		
		
	}

}
