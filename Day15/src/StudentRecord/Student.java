package StudentRecord;


public class Student{
	private int rollNo;
	private String name;
	private double marks;
	private String email;
	
	public int getRollNo() {
		return rollNo;
	}

	public Student(int rollNo, String name, double marks, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + "\t, name=" + name + "\t, marks=" + marks + "\t, email=" + email + "]";
	}
	
	public String toFile() {
		return "" + rollNo + "," + name + "," + marks + "," + email + "";
	}
	
	
}
