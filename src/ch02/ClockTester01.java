package ch02;

public class ClockTester01 {

	public static void main(String[] args) {

		Clock c1 = new Clock(1, 23, true);

	}


	public void printTime(Clock clock) {
		System.out.println(clock.getHour());
		clock.hour = 2;

	}

}
