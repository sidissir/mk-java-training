package stringspackage;

public class StringConcatenation {

	public static void main(String[] args) {
		//String concatenation
		//Adding/Joining
		
		
		
		//Using concat method
		String str1 = "Sachin";
		String str2 = " Tendulkar";
		
		
		
		String concatStr = str1.concat(str2);
		System.out.println("Sachin's Full name is : " + concatStr);

		
		int i = 1;
		System.out.println("Praveena's Rank is  " + i + " And She worked hard to be first in the class");
		
		//Using +
		String str3 = "Raji";
		String str4 = "Sathish";
		String anotherConcatStr = str3+ str4;
		System.out.println(anotherConcatStr);
		
		
		
		String randomStr = "Sachin" + "ramesh" + "tendulkar";
		System.out.println(randomStr);
		
	}

}
