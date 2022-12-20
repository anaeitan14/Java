package zoo;

public class Eagle extends Bird {
	protected String eagleType;

	public Eagle(String name, int age, boolean isHunted, double calories, double flightHeight, double wingSpan) {
		super(name, age, isHunted, calories, flightHeight, wingSpan);
		this.eagleType = eagleType;
	}

	public void setEagleType(String eagleType) {
		this.eagleType = eagleType;
	}

	public String getEagleType() {
		return eagleType;
	}

	public String toString() {
		return super.toString() + " eagle type: " + eagleType;
	}
}
