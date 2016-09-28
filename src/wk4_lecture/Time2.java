package wk4_lecture;

public class Time2 {
	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");

		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");

		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");

		this.second = second;
	}

	// OVERLOADED CONSTRUCTORS
	public Time2() {
		this(0, 0, 0);
	}

	public Time2(int hour) {
		this(hour, 0, 0);
	}

	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}

	public Time2(int hour, int minute, int second) {
		this.setTime(hour, minute, second);
	}

	// COPY CONSTRUCTOR
	public Time2(Time2 t) {
		this(t.getHour(), t.getMinute(), t.getSecond());
	}

	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0 to 23");
		}
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0 to 59");
		}
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0 to 59");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/**
	 * Returns the current time in a universal time format HH:MM:SS
	 * 
	 * @return {String}
	 */
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}

	/**
	 * Return string in following format H:MM:SS + AM or PM
	 * 
	 * @return {String}
	 */
	public String toString() {
		return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, this.minute, this.second,
				(hour >= 12) ? "PM" : "AM");
	}

}
