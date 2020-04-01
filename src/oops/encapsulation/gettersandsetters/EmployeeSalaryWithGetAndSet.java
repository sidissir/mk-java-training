package oops.encapsulation.gettersandsetters;

public class EmployeeSalaryWithGetAndSet {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		
		System.out.println("------------------------------");

		emp1.setId(11) ;
		emp1.setName("Siddu Reddy");
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
	}

}
