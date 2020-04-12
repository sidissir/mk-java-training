package exceptionhandling.handleatorigin;

public class HandleAtoriginCaller {

	public static void main(String[] args) {
		System.out.println("Program execution Started");

		HandleAtorigin obj1 = new HandleAtorigin();
		
		System.out.println("Object created ");
		
		int x = obj1.getModulousValue();

		int y = obj1.getSum();
		
		System.out.println(" Final Calculated value is : " + (x * y));

		System.out.println("Program execution ended");
	}

}
