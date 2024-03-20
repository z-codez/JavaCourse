package package2;

import java.util.ArrayList;

interface OnlineCourse {
	void enrollStudent(String studentName);
	void displayCourseDetails();

}

class ProgrammingCourse implements OnlineCourse {
	
	private final ArrayList<String> studentList = new ArrayList<>();
	
	private final String courseName = "Java 101";
	private final String instructorName = "Vita Lambert";

	@Override
	public void enrollStudent(String studentName) {
		studentList.add(studentName);
		System.out.println("Student enrolled sucessfully");
		
	}

	@Override
	public void displayCourseDetails() {
		System.out.println("\nCourse: " + this.courseName);
		System.out.println("Instructor: " + this.instructorName);
		System.out.println("Enrolled students: " + this.studentList);
		
	}
	
}

class MathCourse implements OnlineCourse {
	
	private final ArrayList<String> studentList = new ArrayList<>();
	
	String courseName = "Math 201";
	final String instructorName = "Lada Bronina";

	@Override
	public void enrollStudent(String studentName) {
		studentList.add(studentName);
		System.out.println("Student enrolled sucessfully");
	}

	@Override
	public void displayCourseDetails() {
		System.out.println("\nCourse: " + this.courseName);
		System.out.println("Instructor: " + this.instructorName);
		System.out.println("Enrolled students: " + this.studentList);
	}
}

class CourseManager {
	private ArrayList<OnlineCourse> courseList = new ArrayList<>();
	
	public void addCourse(OnlineCourse course) {
		courseList.add(course);
		System.out.println("Course added successfully");
	}
	
	public void enrollStudentCourse(String studentName, OnlineCourse course) {
			course.enrollStudent(studentName);
	}
	
	public void displayCourses() {
		for (OnlineCourse course: courseList) {
			course.displayCourseDetails();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MathCourse math = new MathCourse();
		ProgrammingCourse prog = new ProgrammingCourse();
		CourseManager manager= new CourseManager();
		
		manager.enrollStudentCourse("Emmanuel", prog);
		manager.enrollStudentCourse("Adaku", math);
		manager.enrollStudentCourse("Lisa", math);
		
		manager.addCourse(math);
		manager.addCourse(prog);
		
		manager.displayCourses();
	}
}

