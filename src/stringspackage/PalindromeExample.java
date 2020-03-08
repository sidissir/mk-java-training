package stringspackage;

public class PalindromeExample {

	public static void main(String[] args) {

		String str1 = "LALAYALAM";

		int strLen = str1.length(); // 9

		boolean isPalindrome = true;

		for (int i = 0; i < strLen / 2; i++) {

			if (str1.charAt(i) != str1.charAt(strLen - i - 1)) {
				isPalindrome = false;
				break;
			}

		}

		if (isPalindrome==true) {
			System.out.println("I am Palindrome");
		} else {
			System.out.println("I am not Palindrome");
		}

	}

}
