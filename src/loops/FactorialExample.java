package loops;

public class FactorialExample {

	public static void main(String[] args) {
		// 5! => 5*4*3*2*1
		//10! => 10*9*8.........*2*1
		
		int n=5;
		
		
		int factorialValue = 1;
		
		
		for(int i=n;i>=1;i--) {
			System.out.println("Factorial Value :" + factorialValue);
			System.out.println("Loop Variable Value :" + i);

			factorialValue = factorialValue * i;
			System.out.println("After ca lculation in each iteration :" + factorialValue);
			System.out.println("---------------------------");
		}
		
		
		System.out.println("Factorial Value :" + factorialValue);
		

	}

}
