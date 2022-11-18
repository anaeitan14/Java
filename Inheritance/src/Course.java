
public class Course {
	private int courseNumber;
	private String courseName;
	private int finalGrade;

	public Course(int courseNumber, String courseName, int finalGrade) {
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.finalGrade = finalGrade;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}

	public String toString() {
		return "course name: " + courseName + " course number:" + courseNumber + " course final grade:" + finalGrade;
	}
}
