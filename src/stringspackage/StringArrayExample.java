package stringspackage;

public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] intAr = new int[4];
		
		// A string array holds multiple strings
		String[] strAr = new String[4];
		
		strAr[0] = " Sankar";
		strAr[1] = " Anusha ";
		strAr[2] = " Raji ";
		strAr[3] = " Sathish ";
		
		
		for(int i=0;i<strAr.length;i++) {
			System.out.println(strAr[i]);	
		}
		
		
		System.out.println("--------------------------------------------------");
		// I want to print length of each string
		for(int i=0;i<strAr.length;i++) {
			String tempStr = strAr[i];
			System.out.println(tempStr);
			System.out.println(tempStr.length());
			System.out.println(tempStr.substring(2));
			System.out.println("@@@@@@@@@@");
		}

		
	}

}
