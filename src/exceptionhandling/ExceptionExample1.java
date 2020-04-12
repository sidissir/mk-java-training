package exceptionhandling;

public class ExceptionExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program execution started");

		int c;
		int a = 15;

		int b = 0;
		System.out.println("Division Operation");
		c = a / b;

		System.out.println("After Divison Operation :" + c);

		int m = 5;
		int n = 10;
		System.out.println("Addition Operation");
		int l = m + n;
		System.out.println("Sum : " + l);
		
		System.out.println(" Final Calculated value is : " + c*l );
		
		System.out.println("Program execution ended");

	}

}
