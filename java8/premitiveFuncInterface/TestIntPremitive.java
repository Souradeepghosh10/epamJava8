package premitiveFuncInterface;

import java.util.function.IntPredicate;

public class TestIntPremitive {

	public static void main(String[] args) {
		IntPredicate intPredicate = (n) -> {
			int flag = 0;
			boolean result = false;
			int m = n / 2;
			if (n == 0 || n == 1) {
				System.out.println(n + " is not prime number");

			} else {
				for (int i = 2; i <= m; i++) {
					if (n % i == 0) {
						System.out.println(n + " is not prime number");
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.println(n + " is prime number");
					result = true;
				}
			} // end of else
			return result;
		};
		
		boolean testPre = intPredicate.test(2);
		System.out.println(testPre);
		
	}

}
