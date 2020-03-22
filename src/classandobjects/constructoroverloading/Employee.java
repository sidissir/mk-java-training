package classandobjects.constructoroverloading;

public class Employee {

	// Constructor overloading => Multiple constructors with differing parameters =>
	// Number of params, data type of params
	// Employee class

	// Variables
	int empId;
	String empName;
	String orgName;
	double monthlySalary;

	// Step 1 : Without constructor

	// Step 2 : with non parameterised constructor
	Employee() {
		empId = 1;
		empName = "Ankitha";
		orgName = "TCS";
		monthlySalary = 3000.00;
	}

	// Step 3 : with parameterised constructor

	Employee(int empIDFrom, String empNameFrom, String orgNameFrom, double monthlySalaryFrom) {
		empName = empNameFrom;
		orgName = orgNameFrom;
		monthlySalary = monthlySalaryFrom;
		empId = empIDFrom;

	}

	// Step 4 : with parameterised constructor

	Employee(int empIDFrom, String empNameFrom, double monthlySalaryFrom) {
		empId = empIDFrom;
		empName = empNameFrom;
		orgName = "TCS";
		monthlySalary = monthlySalaryFrom;
	}

	// Methods

	public void getEmpId() {
		System.out.println("Emp Id is  :" + empId);
	}

	public void getEmpName() {
		System.out.println("Emp Name is  :" + empName);
	}

	public void getNetSalary() {
		System.out.println(monthlySalary * 12);
	}

	// main method
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.getEmpId();
		obj1.getEmpName();
		obj1.getNetSalary();
		System.out.println(obj1.orgName);
		System.out.println("-------------------");

		Employee obj2 = new Employee(2, "Praveena", "TCS", 2980);
		obj2.getEmpId();
		obj2.getEmpName();
		obj2.getNetSalary();
		System.out.println(obj2.orgName);

		System.out.println("-------------------");

		Employee obj3 = new Employee(3, "Prashanthi", "TCS", 2970);
		obj3.getEmpId();
		obj3.getEmpName();
		obj3.getNetSalary();
		System.out.println(obj3.orgName);

		System.out.println("-------------------");

		Employee obj4 = new Employee(4, "Raji", 4000);
		obj4.getEmpId();
		obj4.getEmpName();
		obj4.getNetSalary();
		System.out.println(obj4.orgName);
		System.out.println("-------------------");

	}
}
