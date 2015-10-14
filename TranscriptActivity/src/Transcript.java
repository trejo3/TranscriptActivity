import java.util.ArrayList;

public class Transcript {
	
	private double qualPoints;
	
	ArrayList<CourseEnrollment> Courses = new ArrayList<CourseEnrollment>();

	
	
	public double getQualPoints() {
		return qualPoints;
	}

	public void setQualPoints(double qualPoints) {
		this.qualPoints = qualPoints;
	}
	
	
	public Transcript()
	{
	}

	
	public void enrollInCourse(CourseEnrollment course)
	{
		Courses.add(course);
	}

	public double calculateQPoints(String grade)
	{
		double qPoints = 0.0;
			
			if (grade.equals("A")) {qPoints = 4.0;}
			if (grade.equals("B")) {qPoints = 3.0;}
			if (grade.equals("C")) {qPoints = 2.0;}
			if (grade.equals("D")) {qPoints = 1.0;}
			if (grade.equals("F")) {qPoints = 0.0;}
		
			return qPoints;
	}
	
	public double calculateGPA()
	{
		double gpa = 0.0;
		double points = 0.0;
		int count = 0;
		
		for(int i = 0; i < Courses.size(); i++)
		{
			points += Courses.get(i).getqPoints();
			count ++;
		}
		gpa = points / count;
		
		return gpa;
	}
	
	@Override
	public String toString()
	{
		String transcriptOutput = "";
		System.out.println("Course      Credits            Grade      Quality Points");
		System.out.println("------      -------            -----          --------");
		
		for(int i = 0; i < Courses.size(); i++)
		{
			transcriptOutput += Courses.get(i).getCourseCode() + "\t";
			transcriptOutput += Courses.get(i).getCredits() + "\t\t";
			transcriptOutput += Courses.get(i).getGrade() + "\t\t";
			transcriptOutput += Courses.get(i).getqPoints() + "\n";
		}
		
		return transcriptOutput;
	}
	
}
