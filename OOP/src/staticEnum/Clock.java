package staticEnum;

public class Clock {
	private int minutes;
	private int hours;
	private Format format;
	private static final int MAX_MINUTES = 60;
	private static final int MAX_HOURS_MILITARY = 24;
	private static final int MAX_HOURS_STANDARD = 12;

	public enum Format {MILITARY_TIME, STANDARD_TIME}
	public enum Time {TOO_HIGH, TOO_LOW, VALID}

	public Clock(int hours, int minutes, Format format) {
		this.hours = hours;
		this.minutes = minutes;
		this.format = format;
	}

	public Clock(Clock other) {
		this(other.hours, other.minutes, other.format);
	}

	public Time setHours(int hours) {
		if (format == Format.STANDARD_TIME && hours < 1) {
			return Time.TOO_LOW;
		} else if (format == Format.MILITARY_TIME && hours < 0) {
			return Time.TOO_LOW;
		} else if (format == Format.STANDARD_TIME && hours >= MAX_HOURS_STANDARD) {
			return Time.TOO_HIGH;
		} else if (format == Format.MILITARY_TIME && hours >= MAX_HOURS_MILITARY) {
			return Time.TOO_HIGH;
		}
		this.hours = hours;
		return Time.VALID;
	}

	public Time setMinutes(int minutes) {
		if (minutes < 0) {
			return Time.TOO_LOW;
		} else if (minutes >= MAX_MINUTES) {
			return Time.TOO_HIGH;
		}
		this.minutes = minutes;
		return Time.VALID;
	}

	@Override
	public String toString() {
			return "Time is:" + hours + ":" + minutes;
	}

}
