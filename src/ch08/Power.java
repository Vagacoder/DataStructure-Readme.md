package ch08;

public class Power {

	public static void main(String[] args) {
		System.out.println(pow2(2,-2));

	}

	public static double pow(double x, int n) {
		if (x == 0 && n <= 0) {
			throw new IllegalArgumentException("x is zero and n=" + n);
		} else if (x == 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (n > 0) {
			return x * pow(x, n - 1);
		} else // x is nonzero, and n is negative.
		{
			return 1 / pow(x, -n);
		}
	}

	public static double pow2(double x, int n) {

		if (n == 0) {
			return 1;
		} else if (n > 0 && n % 2 == 0) {
			return pow2(x, n / 2) * pow2(x, n / 2);
		}
		else if (n > 0 && n%2 ==1) {
			return x * pow2(x, n-1);
		}
		else {
			return 1/pow2(x, -n);
		}
	}

}
