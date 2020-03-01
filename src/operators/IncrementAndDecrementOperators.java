package operators;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		// ++

		// If we are using increment operators and not assigning, then they both behave
		// similiarly

		int l = 5;
		// l = l+1;
		l++;
		System.out.println(l);

		// l=l-1;
		l--;
		System.out.println(l);

		// If we are using increment operators and assigning, then they both behave
		// differently
		// ++x, x++
		System.out.println("===========================================");

		int x = 23;
		int m;
		// m = ++x;
		m = x++;
		System.out.println(m);

		// If we are using increment operators and assigning, then they both behave
		// differently
		// --x, x--
		System.out.println("===========================================");

		int y = 23;
		int n;
		n = --y;
		// n = y--;
		System.out.println(n);

	}
}
