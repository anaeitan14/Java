
public class Student extends Person {

	private int[] grades;
	private int amountGrades;

	public Student(String name, String ID) {
		super(name, ID);
		grades = new int[5];
		amountGrades = 0;
	}

	private void addGrade(int grade) {
		if (amountGrades < grades.length) {
			grades[amountGrades++] = (int) ((Math.random() * 61) + 40);
		}
	}

	public double getAverage() {
		double sum = 0.0;
		for (int i = 0; i < amountGrades; i++) {
			sum += grades[i];
		}
		return sum / amountGrades;
	}

	public String toString() {
		return super.toString() + " average:" + getAverage();
	}
}
