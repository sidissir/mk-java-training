package loops;

public class NestedForLoop {

	public static void main(String[] args) {


		/*
		 * for(int i=1;i<=10;i++) { System.out.println(tableNumber*i); }
		 */
		
		//2   1 ,2,3,4,5,6,7,8,9,10
		//3,  1 ,2,3,4,5,6,7,8,9,10
		//4   1 ,2,3,4,5,6,7,8,9,10	
		
		//20  1 ,2,3,4,5,6,7,8,9,10

		for (int tableNumberLoopVar = 2; tableNumberLoopVar <= 20; tableNumberLoopVar++) {
			System.out.println("========== Table Number :" + tableNumberLoopVar);

			//3
			for (int innerloopVar = 1; innerloopVar <= 10; innerloopVar++) {
				//1,2,3
				System.out.println(tableNumberLoopVar * innerloopVar);
			}
			System.out.println("==========Next Table");
		}

	}

}
