<<<<<<< HEAD
package ch08;

public class Bear {
	public static boolean bears(int initial, int goal, int increment, int n) {

		if (initial == goal) {
			return true;
		} else if (n == 0) {
			return false;
		} else if (bears(initial + increment, goal, increment, n - 1)) {
			return true;
		} else if ((initial % 2 == 0) && bears(initial / 2, goal, increment, n - 1)) {
			return true;
		} else {
			return false;
		}
	}

}
=======
package ch08;

public class Bear {
	public static boolean bears(int initial, int goal, int increment, int n) {

		if (initial == goal) {
			return true;
		} else if (n == 0) {
			return false;
		} else if (bears(initial + increment, goal, increment, n - 1)) {
			return true;
		} else if ((initial % 2 == 0) && bears(initial / 2, goal, increment, n - 1)) {
			return true;
		} else {
			return false;
		}
	}

}
>>>>>>> 729a8515ee0d2a684401ee3be05dc5bce509cb3e
