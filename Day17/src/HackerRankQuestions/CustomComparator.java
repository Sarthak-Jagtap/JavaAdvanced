package HackerRankQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
	int rollNo;
	String name;
	double marks;

	Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "roll no : " + rollNo + ", \tname : " + name +", \tmarks : " + marks + "\n";
	}
}

/// Return = 0  -> when equal
/// Return < 0  -> if first object is less than second
/// Return > 0  -> if first object is greater than second

class CompareWithRoll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo - o2.rollNo;
	}
}

class CompareWithName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}

class CompareWithMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.marks, o2.marks);
	}
}

public class CustomComparator {
	public static void main(String[] args) {

		List<Student> stud = Arrays.asList(new Student(101, "Ram", 94.5), new Student(105, "Sita", 75.6),
				new Student(100, "Hanuman", 87.2), new Student(104, "Lakshaman", 91.3));

		System.out.println(stud);

		CompareWithRoll cmp = new CompareWithRoll();

		stud.sort(cmp);

		System.out.println(stud);

		CompareWithName cmp2 = new CompareWithName();

		stud.sort(cmp2);

		System.out.println(stud);
		
		CompareWithName cmp3 = new CompareWithName();

		stud.sort(cmp3);

		System.out.println(stud);
	}
}
