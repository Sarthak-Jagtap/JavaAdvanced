package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * 4️⃣ Employee Filtering System (Encapsulation + Stream)
 * 
 * Create a class:
 * 
 * class Employee { private int id; private String name; private double salary;
 * private String department;
 * 
 * // Constructor + Getters + Setters }
 * 
 * 
 * Given a List<Employee>:
 * 
 * Tasks:
 * 
 * Find employees with salary > 50,000.
 * 
 * Group employees by department.
 * 
 * Find highest paid employee in each department.
 * 
 * Calculate average salary per department.
 */

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

}

public class Ques04 {
	public static void main(String[] args) {

		
		
		
		List<Employee> list = Arrays.asList(
			    new Employee(101, "Aarav Sharma", 55000, "IT"),
			    new Employee(102, "Neha Verma", 62000, "HR"),
			    new Employee(103, "Rohit Patil", 75000, "Finance"),
			    new Employee(104, "Priya Nair", 68000, "IT"),
			    new Employee(105, "Kunal Mehta", 48000, "Marketing"),
			    new Employee(106, "Sneha Kulkarni", 82000, "Finance"),
			    new Employee(107, "Vikram Singh", 90000, "IT"),
			    new Employee(108, "Ananya Rao", 53000, "HR"),
			    new Employee(109, "Rahul Joshi", 61000, "Marketing"),
			    new Employee(110, "Pooja Deshpande", 70000, "IT")
			);

		
//		// Find employees with salary > 50,000.
//		list.stream().filter(e -> e.getSalary() > 50000).forEach(System.out::println);
//		
//		// Group employees by department.
//		list.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.groupingBy(Employee::getDepartment));
//		
//		// Find highest paid employee in each department.
//		list.stream()
//		.collect(Collectors.groupingBy(
//				Employee::getDepartment,
//				Collectors.maxBy(
//						Comparator.comparing(Employee::getSalary)
//						)
//				)
//				);
//		// Calculate average salary per department.
//		list.stream()
//			.collect(Collectors.groupingBy(
//					Employee::getDepartment,
//					Collectors.averagingDouble(Employee::getSalary)
//				))
//			.forEach((k,v) -> System.out.println(k + " " + v));
		
		
		System.out.println(list.stream().collect(Collectors.summingDouble(Employee::getSalary)));
		System.out.println();
		list.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		
	}
}
