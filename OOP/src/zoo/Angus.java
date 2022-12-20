package zoo;

public class Angus extends Cow {
	protected double weight;

	public Angus(String name, int age, boolean isHunted, double calories, double milkCalories, int pregMonth,
			int birthCount) {
		super(name, age, isHunted, calories, milkCalories, pregMonth, birthCount);
		this.birthCount = birthCount;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String toString() {
		return super.toString() + " weight: " + weight;
	}

}
