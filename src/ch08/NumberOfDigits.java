package ch08;

public class NumberOfDigits {

	public static void main(String[] args) {
		System.out.println(countNumber(-100));
		System.out.println(countNumber2(-100));
	}

	public static int countNumber(int number) {

		if (number < 0) {
			return countNumber(-number);
		}
		else if (number == 0) {
			return 1;
		}
		else {
			return (int) Math.floor(Math.log10(number) + 1);
		}
	}

	public static int countNumber2(int number) {

		if (number < 10 && number > -10) {
			return 1;
		}
		else {
			return 1 + countNumber2(number / 10);
		}
	}

}
