package FileHandling;

public class Student {
	int rollNo;
	String name;
	double marks;

	Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "" + rollNo + "," + name + "," + marks + "";
	}
}
