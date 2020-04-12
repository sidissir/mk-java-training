package exceptionhandling;

public class ExceptionExample2Handled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program execution started");

		//String str = null;
		String str = "Virender Sehwag";

		// String str = "Sachin Ramesh tendulkar";

		System.out.println("Given String is : " + str);
		int len = 0;
		try {
			len = str.length();

		} catch (Exception e) {
			System.out.println("Catch block started");
			str = "Sachin Ramesh Tendulkar";
			System.out.println("Catch block Ended");
		}

		System.out.println("Length of the string is  : " + len);

		System.out.println(str.charAt(5));

		System.out.println(str.substring(8));

		System.out.println(str.contains("Sachin"));

		System.out.println("Program execution ended");

	}

}
