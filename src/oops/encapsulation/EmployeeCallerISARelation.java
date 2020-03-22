package oops.encapsulation;

// Is A relationship is achived using inheritance (using extends keyword)

public class EmployeeCallerISARelation extends Employee{

	
	public void methodWhichAccessParentClassVariable() {
		//Trying to access in subclass
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
	
}
