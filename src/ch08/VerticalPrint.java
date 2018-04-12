
package ch08;

public class VerticalPrint {

	public static void main(String[] args) {

		superWriteVertical(-123456);

	}


	public static void verticalPrint(int number) {

		if (number < 10) {
			System.out.println(number);
		}

		else {

			verticalPrint(number / 10);
			System.out.println(number % 10);
		}
	}


	public static void superWriteVertical(int number) {

		if (number < 0) {
			System.out.println("-");
			superWriteVertical(-number);
		} else if (number < 10) {
			System.out.println(number);
		} else {
			superWriteVertical(number / 10);
			System.out.println(number % 10);
		}
	}

}
