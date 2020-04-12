package exceptionhandling.multiplecatchblocks;

import com.sun.corba.se.spi.extension.ZeroPortPolicy;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program execution started");

		try {
			int c;
			int a = 15;

			int b = 3;
			System.out.println("Division Operation");
			c = a / b;

			System.out.println("After Divison Operation :" + c);

			int m = 5;
			int n = 10;
			System.out.println("Addition Operation");
			int l = m + n;
			System.out.println("Sum : " + l);

			System.out.println(" Final Calculated value is : " + c * l);

			System.out.println("Program execution ended");

			System.out.println("Program execution started");

			String str = null;

			// String str = "Sachin Ramesh tendulkar";

			System.out.println("Given String is : " + str);
			int len = str.length();

			System.out.println("Length of the string is  : " + len);

			System.out.println(str.charAt(5));

			System.out.println(str.substring(8));

			System.out.println(str.contains("Sachin"));

			System.out.println("Program execution ended");
			System.out.println("Program execution started");

			int[] intAr = new int[3];

			intAr[0] = 123;
			intAr[1] = 23;
			intAr[2] = 1123;

			int arLen = intAr.length;
			System.out.println("Length of Array is : " + arLen);

			System.out.println("Running a for loop to display values present in array ");

			for (int i = 0; i <= arLen; i++) {
				System.out.println(intAr[i]);
			}

			System.out.println("All elements printed ");
		} catch (ArithmeticException e) {

			System.out.println("Inside Arithmetic Exception catch block");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Inside Null Pointer Exception catch block");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Array Index OutOfBounds Exception catch block");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Inside parent exception");
			e.printStackTrace();
		}

		System.out.println("Program execution Ended");
	}

}
