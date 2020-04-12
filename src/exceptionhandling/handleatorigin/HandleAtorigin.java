package exceptionhandling.handleatorigin;

public class HandleAtorigin {

	public int getModulousValue() {
		int c = 0;
		int a = 15;
		int b = 0;
		System.out.println("Division Operation");

		try {

			c = a / b;

		} catch (Exception e) {
			System.out.println("Catch block inside  getModulousValue method");
			c = 10;
		}

		System.out.println("After Divison Operation :" + c);
		return c;

	}

	public int getSum() {
		int m = 5;
		int n = 10;
		System.out.println("Addition Operation");
		int l = m + n;
		System.out.println("Sum : " + l);

		return l;
	}

}
