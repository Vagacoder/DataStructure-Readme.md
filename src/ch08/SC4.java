package ch08;

public class SC4 {

	public static void main(String[] args) {

		starPrint(3);

	}


	public static void starPrint(int number) {

		if (number < 1) {
			System.out.println("!");
		} else {
			System.out.print("*");
			starPrint(number - 1);
		}

	}

}
