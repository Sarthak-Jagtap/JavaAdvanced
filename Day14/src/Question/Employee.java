package Question;

import java.util.Comparator;

public class Employee {
	String name;
	double salary;
	int age;

	Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	Employee() {
		this.name = "abc";
		this.salary = 0.0;
		this.age = 0;
	}

	public static Comparator<Employee> compareWithName = new Comparator<>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.name.compareTo(e2.name);
		}
	};

	public static Comparator<Employee> compareWithSal = new Comparator<>() {

		public int compare(Employee e1, Employee e2) {
			return Double.compare(e1.salary, e2.salary);
		}
	};

	public static Comparator<Employee> compareWithAge = new Comparator<>() {
		public int compare(Employee e1, Employee e2) {
			return Integer.compare(e1.age, e2.age);
		}
	};

	@Override
	public String toString() {
		return "\n[ name : " + name + " Sal : " + salary + " Age : " + age + "]";
	}

}
