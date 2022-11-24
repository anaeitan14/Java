package Zoo;

public abstract class Mammal extends Animal {
	protected double milkCalories;
	protected int pregMonth;

	public Mammal(String name, int age, boolean isHunted, double calories, double milkCalories, int pregMonth) {
		super(name, age, isHunted, calories);
		this.milkCalories = milkCalories;
		this.pregMonth = pregMonth;
	}

	public double getMilkCalories() {
		return milkCalories;
	}

	public void setMilkCalories(double milkCalories) {
		this.milkCalories = milkCalories;
	}

	public int getPregMonth() {
		return pregMonth;
	}

	public void setPregMonth(int pregMonth) {
		this.pregMonth = pregMonth;
	}

	@Override
	public String toString() {
		return super.toString() + " milkCalories" + milkCalories + " pregMonth:" + pregMonth;
	}
	
	@Override
	public double Eat() {
		return super.Eat() + milkCalories;
	}
}
