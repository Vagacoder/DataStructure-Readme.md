<<<<<<< HEAD
package ch08;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(-2, -3));
	}


	public static double power(double x, int n) {

		double product;
		int count;

		if (x == 0 && n <= 0) {
			throw new IllegalArgumentException("x is zero and n = " + n);
		} else if (x == 0) {
			product = 0;
		} else if (n > 0) {
			product = x * power(x, n - 1);
		} else if (n == 0) {
			product = 1;
		} else {
			product = 1 / power(x, -n);
		}
		return product;
	}
}
=======
package ch08;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(-2, -3));
	}


	public static double power(double x, int n) {

		double product;
		int count;

		if (x == 0 && n <= 0) {
			throw new IllegalArgumentException("x is zero and n = " + n);
		} else if (x == 0) {
			product = 0;
		} else if (n > 0) {
			product = x * power(x, n - 1);
		} else if (n == 0) {
			product = 1;
		} else {
			product = 1 / power(x, -n);
		}
		return product;
	}
}
>>>>>>> 729a8515ee0d2a684401ee3be05dc5bce509cb3e
