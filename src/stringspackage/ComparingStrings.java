package stringspackage;

public class ComparingStrings {

	public static void main(String[] args) {
		
		//Two methods to compare 2 strings
		//str.equals()
		//str.equalsIgnoreCase
		//Don't use == for string comparison
		
		String str1 = "Praveena";
		String str2 = "praveena";
		
		if(str1.equals(str2)) {
			System.out.println("Both strings are the same");
		}else {
			System.out.println("They are not the same");
		}
		
		
		System.out.println("-----------------------");
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Both strings are the same");
		}else {
			System.out.println("They are not the same");
		}
		

	}

}
