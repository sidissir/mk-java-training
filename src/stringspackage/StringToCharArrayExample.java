package stringspackage;

public class StringToCharArrayExample {

	public static void main(String[] args) {

		
		
		
		char[] chAr = new char[5];
		
		chAr[0] = 'A';
		chAr[1] = 'B';
		chAr[2] = 'C';
		chAr[3] = 'D';
		chAr[4] = 'E';
		
		
		String str1 = "Sachin Tendulkar";

		char[] myCharAr = str1.toCharArray();
		
		for(int i=0;i<myCharAr.length;i++) {
			System.out.println(myCharAr[i]);
		}
		
	}

}
