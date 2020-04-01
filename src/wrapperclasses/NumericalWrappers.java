package wrapperclasses;

public class NumericalWrappers {

	public static void main(String[] args) {

		int intVar = 123;
		int intAnotherVar = 10;

		int sum = intVar + intAnotherVar;

		System.out.println(sum);
		System.out.println("----------------------------------");

		// Creating wrapper class object for primitive int value 5
		// Wrapping / Boxing
		Integer intWrapperObj = new Integer(123);

		// Auto wrapping
		Integer intWrapperObj1 = 5;

		// Unwrapping or Unboxing
		int valueInside = intWrapperObj.intValue();

		// Auto unwrapping
		int valueInside1 = intWrapperObj;

		Integer intAnotherWrapperObj = new Integer(10);

		// To retrieve int value present in wrapper object => obj.intValue();

		Integer intSumWrapperObj = intWrapperObj.intValue() + intAnotherWrapperObj.intValue();

		System.out.println(intSumWrapperObj);

		System.out.println(intSumWrapperObj.doubleValue() + 123);

		System.out.println(intSumWrapperObj.toString() + 123);

		System.out.println("----------------------------------");

		int id = Integer.parseInt("123");
		System.out.println(id);

		System.out.println("----------------------------------");

		// Double wrapper class

		double doublePrimVar = 123.34;

		Double doubleWrObj = new Double(123.34);

		System.out.println(doubleWrObj.doubleValue());
		System.out.println(doubleWrObj.intValue());

		// "153.34"
		System.out.println(Double.parseDouble("153.34"));

		System.out.println("----------------------------------");
		// Boolean wrapper class

		boolean boolPrimVar = true;

		Boolean boolWrObj = new Boolean(true);
		System.out.println(boolWrObj.toString()); // "true"

		// "true"
		String str1 = "false";
		boolean b = Boolean.parseBoolean(str1);
		System.out.println(b);

		System.out.println("----------------------------------");

		//System.out.println(Integer.parseInt("123.34"));
		Double doubObj = Double.parseDouble("123.34");
		int inValue = doubObj.intValue();
		System.out.println(inValue);

	}

}
