package conditionalstatements;

public class IfAndElseStetements {

	public static void main(String[] args) {

		int a = 21;

		int remainder = a % 2;
		System.out.println(remainder);

		// if
		if (remainder == 0) {
			System.out.println("Even Number");
		}

		// if-else
		if (remainder == 0) {
			System.out.println("I am Even Number");
		} else {
			System.out.println("I am Odd Number");

		}

		// if-else-if
		char gender = 'F';
		int age = 23;

		if (gender == 'F') {
			if (age >= 13 && age <= 19) {
				System.out.println("Female Teenager");
			} else if (age < 13) {
				System.out.println("Girl");
			} else if (age > 19) {
				System.out.println("Woman");
			}

		}

	}

}
