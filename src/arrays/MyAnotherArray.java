package arrays;

public class MyAnotherArray {

	public static void main(String[] args) {

		//char array exmple
		// size is mandatory
		//Declaring array
		char[] gradesAr = new char[4];
		
		
		//Initializing Array => Nothing but Storing initial values in Array
		gradesAr[0] = 'A';
		gradesAr[1] = 'B';
		gradesAr[2] = 'C';
		gradesAr[3] = 'D';
		
		
		//length method returns the length of array
		int arrayLength = gradesAr.length;
		
		
		for(int i=0;i<arrayLength;i++) {
			System.out.println(gradesAr[i]);
		}
		
		
		System.out.println("------------");
		gradesAr[3] = 'E';
		
		for(int i=0;i<arrayLength;i++) {
			System.out.println(gradesAr[i]);
		}
		
	}

}
