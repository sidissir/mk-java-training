package exceptionhandling.handleatcaller;


public class HandleAtCaller {

	public int getModulousValue() throws Exception  {
		int c = 0;
		int a = 15;
		int b = 3;
		System.out.println("Division Operation");
		c = a / b;
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
