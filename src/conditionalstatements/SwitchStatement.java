package conditionalstatements;

public class SwitchStatement {

	public static void main(String[] args) {

		char grade;

		grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("I am very intelligent");
			break;
		case 'B':
			System.out.println("I am Intelligent");
			break;
		case 'C':
			System.out.println("I am OK");
			break;
		case 'D':
			System.out.println("I just managed to pass");
			break;
		default:
			System.out.println("I am dumb");
		}

		if (grade == 'A') {
			System.out.println("I am very intelligent");
		} else if (grade == 'B') {
			System.out.println("I am intelligent");
		} else if (grade == 'C') {
			System.out.println("I am OK");
		} else if (grade == 'D') {
			System.out.println("I just managed to pass");
		} else {
			System.out.println("I am dumb");
		}

	}

}
