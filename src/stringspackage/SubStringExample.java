package stringspackage;

public class SubStringExample {

	public static void main(String[] args) {


		String str1 = "Sachin Tendulkar";
		
		//Returns character present at 2nd index
		System.out.println(str1.charAt(2));

		
		
		//To get the substring from 2nd index till end of the string
		System.out.println(str1.substring(2));
		
		//To get the substring from 2nd index till 8th index
		System.out.println(str1.substring(2,9));
		
	}

}
