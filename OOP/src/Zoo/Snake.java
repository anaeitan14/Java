package Zoo;

public class Snake extends Reptile {
	protected boolean isToxic;

	public Snake(String name, int age, boolean isHunted, double calories, double tailLength,
			boolean isToxic) {
		super(name, age, isHunted, calories, tailLength);
		this.isToxic = isToxic;
	}

	public void setIsToxic(boolean isToxic) {
		this.isToxic = isToxic;
	}

	public boolean getIsToxic() {
		return isToxic;
	}

	public String toString() {
		return super.toString() + " is toxic : " + isToxic;
	}
}
