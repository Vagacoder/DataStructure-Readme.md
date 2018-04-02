package ch08;

public class SC2 {

	public static void main(String[] args) {
		cheers2(3);

	}


	public static void cheers(int n) {
		if (n <= 1)
			System.out.println("Hurrah");
		else {
			System.out.println("Hip");
			cheers(n - 1);
		}
	}


	public static void cheers2(int n) {
		if (n <= 1)
			System.out.println("Hurrah");
		else {
			cheers2(n - 1);
			System.out.println("Hip");
		}
	}

}
