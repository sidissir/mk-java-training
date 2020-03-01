package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		int tableNumber = 13;
		int loopVar = 11;
	

		do { // front door

			System.out.println("You can not stop me from geting executed atleast once");
			System.out.println(tableNumber * loopVar);
			loopVar++;
			
		} while (loopVar <= 10); //
	}

}
