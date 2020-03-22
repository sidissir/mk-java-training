package oops.diffencapsulationpackage;

import oops.encapsulation.Employee;

public class EmployeeCallerISARelationFromDifPack extends Employee {
	public void methodWhichAccessParentClassVariable() {
		//Trying to access in subclass
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
}
