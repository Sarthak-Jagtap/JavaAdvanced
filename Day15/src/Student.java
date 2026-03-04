import java.io.Serializable;

public class Student implements Serializable{
	int rollNo;
	String name;
	double marks;	
    transient String passward;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, double marks, String password) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.passward = password;
	}
	
	public void display() {
		System.out.println(rollNo + " " + name + " " + marks + " " + passward);
	}
}
