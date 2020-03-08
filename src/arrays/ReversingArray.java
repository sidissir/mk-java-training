package arrays;

public class ReversingArray {

	public static void main(String[] args) {

		char[] gradesAr = { 'A', 'B', 'C', 'D' };
		
		char[] reversedAr = new char[4];
		
		int lengthOfAr = gradesAr.length; 
		
		for(int i=0;i<lengthOfAr;i++) {
			reversedAr[lengthOfAr-i-1] = gradesAr[i];
			//3 , 0
			//  2,1
			//	1,2
			// 0,3
		}
		
		
		//Print the values from reversed array
		for(int i=0;i<reversedAr.length;i++) {
			System.out.println(reversedAr[i]);
		}
		

		
		
	}

}
