package loops;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i=0;i<50;i++) {
			//I want to print only Odd numbers
			if(i%2==0) { //If even=> I am executing continue
				continue;
			}
			System.out.println(i);
		}

	}

}
