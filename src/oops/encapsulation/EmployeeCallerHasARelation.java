package oops.encapsulation;

public class EmployeeCallerHasARelation {

	public static void main(String[] args) {

		
		// Has a realtion is nothing but creating object of another class in this class using new keyword
		Employee emp1 = new Employee();

		//Trying to access using object
		System.out.println(emp1.privateVar);
		System.out.println(emp1.defaultVar);
		System.out.println(emp1.protectedVar);
		System.out.println(emp1.publicVar);


		
	}

}
