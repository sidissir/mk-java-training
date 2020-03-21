package variabletypes;

public class Emp {

	// Member / Instance variables
	int empId;
	String empName;
	double monthlySalary;
	double rating;
	// Static variables=> Instance variables declared using static keyword are
	// called as static variables
	// static variables are called as class level variables
	// Can be accesses using class name.
	// We can access static variables using object but its not preferable
	// static means one per class not one per object
	// Static variable can be a constant value or variable value, but its a single copy across all objects
	static String orgName = "TCS";
	static double maxBonus = 4000;
	static int empCount = 0;


	// Constructor
	Emp(int empIdFrom, String empNameFrom, double monthlySalaryFrom, double ratingFrom) {
		empId = empIdFrom;
		empName = empNameFrom;
		// orgName = orgNameFrom;
		monthlySalary = monthlySalaryFrom;
		rating = ratingFrom;
		//maxBonus = maxBonusFrom;
	}

	// Member /Instance methods
	public void calculateCTC() {
		double bonusComponent;
		double totalCostToComp;
		bonusComponent = (rating / 5) * maxBonus;
		System.out.println("Bonus Component is :" + bonusComponent);
		totalCostToComp = (monthlySalary * 12) + bonusComponent;
		System.out.println("Total CTC is :" + totalCostToComp);

	}

	public void salaryPerEmp() {
		System.out.println(empName);
	}
	
	public static void incrementEmpCount() {
		//System.out.println("A new employee joined today :" + empName);
		empCount = empCount + 1;
		System.out.println("Emp Count : "+empCount);
	}

	public static void main(String[] args) {
		
		System.out.println("Started execution");
		System.out.println("I am learning Static Variables");
		
		Emp emp1 = new Emp(1, "Ankitha", 3000, 4.5);
		System.out.println(emp1.empId);
		System.out.println(Emp.orgName);
		emp1.calculateCTC();
		emp1.incrementEmpCount();
		System.out.println("--------------------------------------");

		Emp emp2 = new Emp(2, "Praveena", 2950, 4.6);
		System.out.println(emp2.empId);
		System.out.println(Emp.orgName);
		emp2.calculateCTC();
		emp2.incrementEmpCount();
		System.out.println("--------------------------------------");

		Emp emp3 = new Emp(3, "Ramya", 2900, 4.7);
		System.out.println(emp3.empId);
		System.out.println(Emp.orgName);
		emp3.calculateCTC();
		emp3.incrementEmpCount();
		System.out.println("--------------------------------------");

		Emp emp4 = new Emp(4, "Prashanthi", 2850, 4.7);
		System.out.println(emp4.empId);
		System.out.println(Emp.orgName);
		emp4.calculateCTC();
		emp4.incrementEmpCount();
		System.out.println("--------------------------------------");

	}

}
