package arrays;

public class InitializingArrayWithArrayConstants {

	public static void main(String[] args) {

		// Declaring array and initializing array with Array constants
		char[] gradesAr = { 'A', 'B', 'C', 'D' };

		// length method returns the length of array
		int arrayLength = gradesAr.length;

		
		// Reading values from array using for loop
		for (int i = 0; i < arrayLength; i++) {
			System.out.println(gradesAr[i]);
		}
		
		
		System.out.println("----------------------------------------");
		
		
		// Reading values from array using for-each loop (Also called as advanced for loop)
		for (char temp :gradesAr) {// for each char value present in gradesAr
			System.out.println(temp);
		}
	}

}
