package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int intVar = 50;
		int[] singDimAr = new int[5];
		
		//Declaring array
		int[][] twoDimAr = new int[4][3];
		
		//Initializing array
		
		//0th row
		twoDimAr[0][0]= 54;
		twoDimAr[0][1]= 89;
		twoDimAr[0][2]= 32;
		
		
		//1st row
		twoDimAr[1][0]= 45;
		twoDimAr[1][1]= 23;
		twoDimAr[1][2]= 56;
		
		//2nd row
		twoDimAr[2][0]= 456;
		twoDimAr[2][1]= 3454;
		twoDimAr[2][2]= 12;
		
		
		//3nd row
		twoDimAr[3][0]= 10;
		twoDimAr[3][1]= 23;
		twoDimAr[3][2]= 87;
		
		
		
		
		//Accessing elements present in two dimensional array
		
		for(int rowLoopVar=0;rowLoopVar<4;rowLoopVar++) {
			System.out.println("Current Row : " + rowLoopVar);
			
			for(int colLoopVar=0;colLoopVar<3;colLoopVar++) {
				System.out.println("Current Column : " +  colLoopVar);
				System.out.println(twoDimAr[rowLoopVar][colLoopVar]); //twoDimAr[i][j]
			}
			
			System.out.println("-------------------------------");
		}
	}

}
