package Zoo;

public abstract class Reptile extends Animal {
	protected double tailLength;

	public Reptile(String name, int age, boolean isHunted, double calories, double tailLength) {
		super(name, age, isHunted, calories);
		this.tailLength = tailLength;
	}

	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}

	public double getTailLength() {
		return tailLength;
	}

	@Override
	public String toString() {
		return super.toString() + " tail length:" + tailLength;
	}

	@Override
	public double Eat() {
		return super.Eat() / 2;
	}
}
