package HackerRankMain;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * */

class Student {
	String name;
	int enrollmentNumber;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return enrollmentNumber + " " + name;
	}
}

class Roster {
	ArrayList<Student> stud = new ArrayList<>();
	int noOfStud = 1;

	public void addStudent(String name) {
		Student s = new Student(name);
		s.enrollmentNumber = noOfStud;
		stud.add(s);
		noOfStud++;
	}

	public void getStudents() {
		for (Student s : stud) {
			System.out.println(s);
		}
	}

	public List<Student> getStud() {
		return stud;

	}

}

public class Ques01 {
	public static void main(String[] args) {

	}
}
