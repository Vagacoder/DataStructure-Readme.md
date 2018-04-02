package ch08;

public class writeVertical {

	public static void main(String[] args) {
		writeNumberVertical(1234);

	}
	
	public static void writeNumberVertical(int number) {
		if (number < 10) {
			System.out.println(number);
		}
		else {
		System.out.println(number%10);
		writeNumberVertical(number/10);
		}
	}

}
