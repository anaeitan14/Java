package Zoo;

public class Crocodile extends Reptile {
	protected boolean passedDentist;

	public Crocodile(String name, int age, boolean isHunted, double calories, double tailLength,
			boolean passedDentist) {
		super(name, age, isHunted, calories, tailLength);
		this.passedDentist = passedDentist;
	}

	public void setPassedDentist(boolean passedDentist) {
		this.passedDentist = passedDentist;
	}

	public boolean getPassedDentist() {
		return passedDentist;
	}

	@Override
	public String toString() {
		return super.toString() + " passed dentist: " + passedDentist;
	}
}
