package exceptionhandling;

public class ExceptionExample1Handled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program execution started");
		
		int c = 0;

		try {


			System.out.println("Try Block Started");
			int a = 15;

			int b = 0;
			System.out.println("Division Operation");
			c = a / b;

			System.out.println("After Divison Operation :"  + c);
			System.out.println("Try Block Ended");

		} catch (Exception e) {
			System.out.println("Catch Block started");
			c = 10;
			e.printStackTrace();
			//System.out.println(e.getMessage());
			
			System.out.println("Catch Block ended");

		}

		Thread.sleep(2000);
		int m = 5;
		int n = 10;
		System.out.println("Addition Operation");
		int l = m + n;
		System.out.println("Sum : " + l);
		
		System.out.println(" Final Calculated value is : " + c*l );

		System.out.println("Program execution ended");

		
	}

}
