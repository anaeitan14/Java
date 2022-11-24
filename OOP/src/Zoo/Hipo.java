package Zoo;

public class Hipo extends Mammal {
	protected double percentageFat;

	public Hipo(String name, int age, boolean isHunted, double calories, double milkCalories, int pregMonth,
			double percentageFat) {
		super(name, age, isHunted, calories, milkCalories, pregMonth);
		this.percentageFat = percentageFat;
	}

	public void setPercentageFat(double PercentageFat) {
		this.percentageFat = PercentageFat;
	}

	public double getPercentageFat() {
		return percentageFat;
	}

	public String toString() {
		return super.toString() + " percentage fat: " + percentageFat;
	}
}
