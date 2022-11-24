package Zoo;

public abstract class Bird extends Animal {

	protected double flightHeight;
	protected double wingSpan;

	public Bird(String name, int age, boolean isHunted, double calories, double flightHeight, double wingSpan) {
		super(name, age, isHunted, calories);
		this.flightHeight = flightHeight;
		this.wingSpan = wingSpan;
	}

	public double getFlightHeight() {
		return flightHeight;
	}

	public void setFlightHeight(double flightHeight) {
		this.flightHeight = flightHeight;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String toString() {
		return super.toString() + " flight height:" + flightHeight + " wing span: " + wingSpan;
	}

}
