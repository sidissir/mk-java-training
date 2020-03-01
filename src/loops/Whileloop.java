package loops;

public class Whileloop {

	public static void main(String[] args) {

		// loopVariable initial value
		// loop variable final Value
		// loop variable condition
		// Increment or decrement oparators

		int tableNumber = 13;
		int loopVar = 11;

		while (loopVar <= 10) {
			System.out.println(tableNumber * loopVar);
			loopVar++;
		}

		System.out.println("==========");
		int anotherTableNumber = 13;
		int anotherLoopVar = 10;

		while (anotherLoopVar >= 0) { // While entering into the house itself condition is checked 
			System.out.println(anotherTableNumber * anotherLoopVar);
			anotherLoopVar--;
		}

	}

}
