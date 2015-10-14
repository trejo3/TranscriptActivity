
public class CourseEnrollment {
	
	private String courseCode, grade;
	private int credits;
	private double qPoints;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public double getqPoints() {
		return qPoints;
	}
	public void setqPoints(double qPoints) {
		this.qPoints = qPoints;
	}	

	
	
	CourseEnrollment (String courseCode, int credits, String grade, double qPoints)
	{
		this.courseCode = courseCode;
		this.credits = credits;
		this.grade = grade;
		this.qPoints = qPoints;
	}

}
