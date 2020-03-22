package oops.diffencapsulationpackage;

import oops.encapsulation.Employee;

public class EmployeeCallerHasARelationFromDiffPack {

	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		System.out.println(emp1.privateVar);
		System.out.println(emp1.defaultVar);
		System.out.println(emp1.protectedVar);
		System.out.println(emp1.publicVar);
	}
}
