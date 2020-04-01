package oops.encapsulation.gettersandsetters;

public class EmployeeSalary {

	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		
		System.out.println("------------------------------");

		emp1.id = 11;
		emp1.name = "Siddu Reddy";
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		
	}
}
