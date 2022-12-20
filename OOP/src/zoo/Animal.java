package zoo;

public abstract class Animal {
	protected String name;
	protected int age;
	protected boolean isHunted;
	protected double calories;

	public Animal(String name, int age, boolean isHunted, double calories) {
		this.name = name;
		this.age = age;
		this.isHunted = isHunted;
		this.calories = calories;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHunted(boolean isHunted) {
		this.isHunted = isHunted;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean getHunted() {
		return isHunted;
	}

	public double getCalories() {
		return calories;
	}

	@Override
	public String toString() {
		return "name: " + name + " age:" + age + " isHunted:" + isHunted + " calories:" + calories;
	}
	
	public double Eat() {
		return calories*3;
	}

}
