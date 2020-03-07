package loops;

public class EvenOddNumbersExamples {

	public static void main(String[] args) {

		// I want to print Even and odd numbers in the given range
		
		// Condition is => If any number is divisible by 2=> Even Else => Odd
		
		
		for(int i=1;i<=50;i++) {
			
			if(i%2==0) { //Even
				System.out.println("I am Even :" + i);
				
			}else { //Odd
				System.out.println("I am Odd :" + i);

			}
			//System.out.println(i);
		}
		
	}

}
