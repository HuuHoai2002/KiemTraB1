package B1_3;

import java.util.Arrays;
import java.util.Scanner;

class Student extends Person {
	private int numCourses;
	private String courses[];
	private int grades[];
	Scanner scanner = new Scanner(System.in);
	public Student(String name, String address) {
		super(name, address);
	}

	@Override
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades=" + grades
				+ "]";
	}
	
	public void addCourseGrade(String course, int grade) {
		courses[0] = course;
		grades[0] = grade;
	}
	public void printGrades() {
		for (String string : courses) {
			
		}
	}
	public double getAveraGrade() {
		return 0;
	}
}
