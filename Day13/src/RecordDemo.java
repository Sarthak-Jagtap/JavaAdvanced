
///
/// Why do we need record???
/// 
/// Record is nothing but a keyword that creates a POJO class automatically with a simple syntax.
/// Internally it is the same, we can create object use getter() setter() constructor etc.

record Student(int rollNo, String name) {}



public class RecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Ram");
		System.out.println(s1.rollNo());
		System.out.println(s1.name());
	}

}
