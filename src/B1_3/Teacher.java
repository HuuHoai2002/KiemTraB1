package B1_3;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher extends Person{
	private int numCourses;
	private String courses[];
	Scanner scanner = new Scanner(System.in);
	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + "]";
	}
	
	public boolean addCourse(String course) {
		return false;
	}
	public boolean removeCourse(String course) {
		return false;
	}
}
