package mainmethod;

public class MyClass {
	
	
	
	
	int myId;
	String myName;
	
	
	MyClass(int myIdFromCaller,String myNameFromCaller){
		myId = myIdFromCaller;
		myName = myNameFromCaller;
	}
	
	public void getMyName() {
		System.out.println(myName);
	}

	
	public void getMyId() {
		System.out.println(myId);
	}
	//main method is predefined method in Java
	//void => main method returns nothing => Since main method is the last 
	public static void main(String[] studentNames) {
		System.out.println("-----------------------------------");

		for(int i=0;i<studentNames.length;i++) {
			System.out.println("Student Is : " + studentNames[i]);
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Program execution Started");
		
		MyClass obj1 = new MyClass(1, "Ankitha");
		obj1.getMyName();
		obj1.getMyId();
		
		//1000 lines of code is here
		
		// You can create objects for another classes
		//You can write any logic 
		
		
		MyClass obj2 = new MyClass(2, "Praveena");
		obj2.getMyName();
		obj2.getMyId();
		
		System.out.println("Program execution End");
	}
}
