package oops.encapsulation.gettersandsetters;

public class Employee {

	// Your money
	
	// Good practice is to declare all member variables as private so that they are hidden to outside of this class
	//Then create getters and setters for each member variable
	// Use : Both get operation and set operation on any member variable is totally on control of current class
	private int id;
	private String name;
	private String emailId;
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int idFromCaller) {
		id = idFromCaller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Mr ."+ name;
	}

	

	Employee() {
		id = 1;
		name = "Siddu";
	}

	public void printEmployeeName() {
		System.out.println(name);
	}

}
