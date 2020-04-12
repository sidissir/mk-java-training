package exceptionhandling.handleatcaller;

public class HandleAtCallerCaller {

	public static void main(String[] args) {
		System.out.println("Program execution Started");

		//HandleAtCaller obj1 = new HandleAtCaller();
		HandleAtCaller obj1 = new HandleAtCaller();


		System.out.println("Object created ");

		int x;

		//x = obj1.getModulousValue();

		try {
			x = obj1.getModulousValue();

		} catch (Exception e) {
			System.out.println("Inside catch block in calling program");
			x = 10;
			System.out.println("Use mask");
		}

		int y = obj1.getSum();

		System.out.println("Final Calculated value is : " + (x * y));

		System.out.println("Program execution ended");

	}

}
