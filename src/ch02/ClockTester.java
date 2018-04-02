package ch02;

public class ClockTester {

	public static void main(String[] args) {
		Clock c1 = new Clock(11, 46, true);
		System.out.println(c1.getHour());
		Clock c2 = c1.clone();
		System.out.println(c2.getHour());

	}

}
