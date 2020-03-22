package oops.encapsulation;

public class Employee {

	private int privateVar;
	int defaultVar;
	protected int protectedVar;
	public int publicVar;

	/*
	 * Employee() { empId = 1; empName = "Ankitha"; }
	 */

	private void getEmpId() {
		//Trying to access all variables in same class
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}

}
