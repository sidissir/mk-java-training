package loops;

public class NestedForLoop {

	public static void main(String[] args) {

		int tableNumber = 14;

		/*
		 * for(int i=1;i<=10;i++) { System.out.println(tableNumber*i); }
		 */

		for (int tableNumberLoopVar = 2; tableNumberLoopVar <= 20; tableNumberLoopVar++) {
			System.out.println("========== Table Number :" + tableNumberLoopVar);

			for (int innerloopVar = 1; innerloopVar <= 10; innerloopVar++) {
				System.out.println(tableNumberLoopVar * innerloopVar);
			}
			System.out.println("==========Next Table");
		}

	}

}
