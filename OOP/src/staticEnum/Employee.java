package staticEnum;

public class Employee {

	public enum Departments {
		QA, RnD, Finance
	};

	private static int employeeCount = 999;
	private static int minimalYearsExperience = 3;
	private String name;
	private int employeeNumber;
	private Departments department;
	private int yearsExperience;

	public Employee(String name, int yearsExperience, Departments department) {
		this.name = name;
		this.yearsExperience = yearsExperience;
		this.department = department;
		this.employeeNumber = ++employeeCount;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMinimalYearsExperience(int minimalYearsExperience) {
		Employee.minimalYearsExperience = minimalYearsExperience;
	}

	public int getMinimalYearsExperience() {
		return minimalYearsExperience;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Department: " + department + " ID: " + employeeNumber + " this employee can"
				+ (yearsExperience < minimalYearsExperience ? " not" : "") + " work at this company.";
	}
}