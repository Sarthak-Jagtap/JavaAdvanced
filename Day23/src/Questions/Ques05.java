package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of Employee objects, find the names of all the employees whose
 * salary is greater than 50000 and who belong to "IT" department.
 */

class Employee {
	String name;
	String department;
	double salary;

	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

}

public class Ques05 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();

		List<String> filtered = list.stream().filter(e -> e.salary > 50000).filter(e -> e.department.equals("IT"))
				.map(Employee::getName).collect(Collectors.toList());
		
		System.out.println(filtered);
	}
}
