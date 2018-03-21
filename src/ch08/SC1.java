package ch08;

public class SC1 {

	public static void main(String[] args) {
		f2(3);

	}


	public static void f(int n) {
		System.out.println(n);
		if (n > 1)
			f(n - 1);
	}


	public static void f1(int n) {
		if (n > 1)
			f1(n - 1);
		System.out.println(n);
	}


	public static void f2(int n) {
		System.out.println(n);
		if (n > 1)
			f2(n - 1);
		System.out.println(n);
	}
}
