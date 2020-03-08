package stringspackage;

public class ReversingString {

	public static void main(String[] args) {

		String str1 = "Sachin Tendulkar";

		String reversedStr = "";

		System.out.println(reversedStr);

		for (int i = str1.length() - 1; i >= 0; i--) {
			
			reversedStr = reversedStr + str1.charAt(i);
			// r = "" + 'r'
			// ar = r + a
			//kar
			//lkar
		}

		System.out.println(reversedStr);
	}

}
