package oops.polymorphism;

public class PolyOverLoading {

	// Member Variables

	// Method Overloading => Is a concept in which multiple methods with same name
	// and different parameters
	// Different parameters => Diff no of params, Diff data types,
	// If method name is same, number of parameters is same and data types of al the
	// parameters ar same and returnType is also same,then it throws compilation
	// error

	// Member methods
	public void getSum(int a, int b) {
		System.out.println(a + b);
	}

	// he following is not allowed
	/*
	 * public int getSum(int a, int b) { System.out.println(a+b); return a+b; }
	 */

	/*
	 * // The following is not allowed public void getSum(int x, int y) {
	 * System.out.println(a+b); }
	 */

	public void getSum(int l, int m, int n) {
		System.out.println(l + m + n);
	}

	public void getSum(String str1, String str2) {
		System.out.println(str1 + str2);
	}

	public static void main(String[] args) {

		PolyOverLoading obj1 = new PolyOverLoading();

		obj1.getSum(2, 3);

		System.out.println("------------------------");
		obj1.getSum(10, 20, 30);

		System.out.println("------------------------");
		obj1.getSum("Siddu ", "Reddy");

	}

}
