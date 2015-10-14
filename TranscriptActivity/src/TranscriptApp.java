import java.util.Scanner;

import myTools.Validator;

public class TranscriptApp {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String another = "";
		
		do{
			Transcript newTranscript = new Transcript();
			
			do{
				
				System.out.println("Enter course: ");
				String courseCode = input.nextLine();
				
				int credits = Validator.getInt(input, "Enter credits: ", 1, 5);
				
				String grade = Validator.getStringGrade(input, "Enter grade: ");
//				String grade = Validator.getString(input, "Enter grade: ");
				
				CourseEnrollment newCourse = new CourseEnrollment(courseCode, credits, grade, newTranscript.calculateQPoints(grade));
				
				newTranscript.enrollInCourse(newCourse);
				
				System.out.println("Another course? (y/n): ");
				another = input.nextLine();
				
			}while (another.equalsIgnoreCase("y"));
			
			System.out.println("");
			System.out.println("");
			
			System.out.println(newTranscript.toString());
			
			System.out.println("");
			System.out.println("                                             GPA:  " + newTranscript.calculateGPA());
		
		}while (another.equalsIgnoreCase("y"));
	}

}
