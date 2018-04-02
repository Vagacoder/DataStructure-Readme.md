<<<<<<< HEAD
package ch01;

public class Ch01Q4 {

	public static void main(String[] args) {
		printSqrt(2);

	}


	public static void printSqrt(double x) {

		if (x < 0) {
			throw new IllegalArgumentException("Argument " + " is smaller than zero");
		}

		System.out.printf("The square root of %.2f is %.4f", x, Math.sqrt(x));

	}

}
=======
package ch01;

public class Ch01Q4 {

	public static void main(String[] args) {
		printSqrt(2);

	}


	public static void printSqrt(double x) {

		if (x < 0) {
			throw new IllegalArgumentException("Argument " + " is smaller than zero");
		}

		System.out.printf("The square root of %.2f is %.4f", x, Math.sqrt(x));

	}

}
>>>>>>> 729a8515ee0d2a684401ee3be05dc5bce509cb3e
