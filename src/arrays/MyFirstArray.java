package arrays;

public class MyFirstArray {

	public static void main(String[] args) {

		// int teluguMarks = 90;
		// int englishMarks = 91;
		// int mathsMarks = 92;
		// int scienceMarks = 93;
		// int socialMarks = 94;

		int[] marksAr = new int[5];

		marksAr[0] = 90;
		marksAr[1] = 91;
		marksAr[2] = 92;
		//marksAr[3] = 93;
		marksAr[4] = 94;

		int arrayLength = marksAr.length;

		System.out.println("Array Length Is : " + arrayLength);

		/*
		 * System.out.println(marksAr[0]); System.out.println(marksAr[1]);
		 * System.out.println(marksAr[2]); System.out.println(marksAr[3]);
		 * System.out.println(marksAr[4]);
		 */
		
		
		//Using for loop
		
		for(int i=0;i<arrayLength;i++) {
			System.out.println("i value is :" + i);
			System.out.println(" Value at ith Index is: " + marksAr[i]);
			System.out.println("----------------------------------------------");
		}

	}

}
