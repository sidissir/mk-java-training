package loops;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		System.out.println("Before first Loop");

		for (int i = 0; i <= 50; i++) {

			if (i == 25) {
				break;
			}

			System.out.println(i);
			// My logic goes here
		}

		System.out.println("After first Loop");

		System.out.println("=================================");

		System.out.println("Before second Loop");

		for (int i = 0; i <= 50; i++) {

			if (i == 25) {
				continue;
			}

			System.out.println(i);
			// My logic goes here
		}

		System.out.println("After second Loop");
		
		
		System.out.println("=================================");
		
		
		
	}

}
