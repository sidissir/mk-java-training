package loops;

public class FibonacciSeriesExample {

	public static void main(String[] args) {

		// What is Fibonacci Series
		// 1,2,3,5,8,13,21,34,55......
		
		int firstNum = 1;
		int secondNum = 2;
		
		System.out.println(firstNum);
		System.out.println(secondNum);


		
		int thirdNum ;
		
		for(int i=0;i<20;i++) {
			
			System.out.println("First Number Is : " + firstNum);
			System.out.println("Second Number Is : " + secondNum);

			
			thirdNum = firstNum + secondNum;
			
			System.out.println("Third Number Is : " + thirdNum);
			
			firstNum = secondNum;
			secondNum = thirdNum;
			
			System.out.println("---------------------------------");
		}
		
	}

}
