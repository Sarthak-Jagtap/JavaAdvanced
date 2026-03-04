package HackerRankM1;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement a student registration and information retrieval system for a
 * school using a simple class Roster in Java. The system should assign an
 * integer ID (enrollmentNumber) to each student, starting from 1 and
 * incrementing by 1 for every new registration. Each student’s name should be
 * stored along with the assigned enrollment number.
 */

class Student {
	int enrollmentNumber;
	String name;

	Student(int enrollmentNumber, String name) {
		this.name = name;
		this.enrollmentNumber = enrollmentNumber;
	}

	public String toString() {
		return "" + enrollmentNumber + " : " + name + "\n";
	}
}

class Roster {
	List<Student> students = new ArrayList<>();

	public void registerStudent(String name) {
		Student stud = new Student(students.size() + 1, name);

		students.add(stud);
	}

	public void getStudent(int enrollmentNumber) {
		if(enrollmentNumber < students.size())
			System.out.print(students.get(enrollmentNumber - 1));
		else
			System.out.println("Invalid Enrollment Number");
	}
	
	public void getAllStudent() {
		System.out.println(students);
	}
}

public class Ques01 {
	public static void main(String[] args) {
		Roster studList = new Roster();
		
		studList.registerStudent("Ram");
		studList.registerStudent("Sita");
		studList.registerStudent("Hanuman");
		studList.registerStudent("Lakshaman");
		
		studList.getAllStudent();
		
		studList.getStudent(3);
	}
}
