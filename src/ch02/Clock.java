package ch02;

public class Clock implements Cloneable {

	int hour = 0;
	int minute = 0;
	boolean morining = true;


	public Clock() {
	}


	public Clock(int hour, int minute, boolean morining) {

		if (hour > 12 || hour < 0) {
			throw new IllegalArgumentException("Wrong range of hour.");
		}

		if (minute > 60 || minute < 0) {
			throw new IllegalArgumentException("Wrong range of minute.");
		}

		this.hour = hour;
		this.minute = minute;
		this.morining = morining;
	}


	/*
	 * (non-Javadoc) Overide equals method
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {

		if (obj instanceof Clock) {

			Clock temp = (Clock) obj;
			return (temp.hour == this.hour) && (temp.minute == this.minute) &&
					(temp.isMorining() == this.isMorining());
		} else {
			return false;
		}

	}


	/*
	 * (non-Javadoc) Overide clone methods
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Clock clone() {
		Clock newClock;

		try {
			newClock = (Clock) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("This class does not implement Cloneabel.");
		}

		return newClock;
	}


	/*
	 * 
	 */
	public int getHour() {
		return hour;
	}


	public int getMinute() {
		return minute;
	}


	public boolean isMorining() {
		return morining;
	}


	public void forwardMinutes(int minute) {

	}
}
