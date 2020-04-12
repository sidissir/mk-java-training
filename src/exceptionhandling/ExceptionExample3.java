package exceptionhandling;

public class ExceptionExample3 {

	public static void main(String[] args) {

		System.out.println("Program execution started");

		int[] intAr = new int[3];
		
		intAr[0] = 123;
		intAr[1] = 23;
		intAr[2] = 1123;

		int len = intAr.length;
		System.out.println("Length of Array is : "+ len);
		
		System.out.println("Running a for loop to display values present in array ");
		
		for(int i=0;i<=3;i++) {
			System.out.println(intAr[i]);
		}
		
		System.out.println("All elements printed ");

		
		System.out.println("Program execution Ended");

	}

}
