package arrays;

public class SummingElementsInArray {

	public static void main(String[] args) {

		
		int[] marksAr = new int[5];

		marksAr[0] = 90;
		marksAr[1] = 91;
		marksAr[2] = 92;
		marksAr[3] = 93;
		marksAr[4] = 94;
		
		int dumbSum = marksAr[0] + marksAr[1] + marksAr[2] + marksAr[3] +marksAr[4] ;
		
		System.out.println("Dumb Sum " + dumbSum);
		System.out.println("------------------------------");
		
		int smartSum = 0;
		
		int lenArray = marksAr.length;
		
		for(int i = 0;i< lenArray;i++) {
			//smartsum = 0 + 90
			//smartsum = 90+ 91
			//smartsum = 181 + 92
			System.out.println("Smart Sum Before Calculation :" + smartSum);
			System.out.println("Marks of Current subject : " + marksAr[i]);
			smartSum = smartSum + marksAr[i];
			System.out.println("Smart Sum After Calculation :" + smartSum);
			System.out.println("-----------------------");

		}
		
		System.out.println("Smart Sum " + smartSum);
	}

}
