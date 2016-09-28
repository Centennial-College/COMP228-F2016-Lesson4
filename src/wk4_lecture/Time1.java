package wk4_lecture;

public class Time1 {

	// PRIVATE VARIABLES
	private int hour;
	private int minute;
	private int second;

	public void setTime(int hour, int minute, int second) {
		// data validation
		if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60) {
			throw new IllegalArgumentException("hour, minute and/or second was out of range");
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
