package zoo;

public class Cow extends Mammal {
	protected int birthCount;

	public Cow(String name, int age, boolean isHunted, double calories, double milkCalories, int pregMonth,
			int birthCount) {
		super(name, age, isHunted, calories, milkCalories, pregMonth);
		this.birthCount = birthCount;
	}

	public void setBirthCount(int birthCount) {
		this.birthCount = birthCount;
	}

	public int getBirthCount() {
		return birthCount;
	}

	@Override
	public String toString() {
		return super.toString() + " birth count: " + birthCount;
	}

	@Override
	public double Eat() {
		return super.Eat() / 4;
	}
}
