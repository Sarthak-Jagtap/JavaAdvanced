package Question;

import java.util.*;

// Remove duplicate Employee objects using Set
public class Ques2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Ram",4.5,23));
		empList.add(new Employee("Sham",5.6,22));
		empList.add(new Employee("Sita",15.6,26));
		empList.add(new Employee("Laksham",9.5,19));
		empList.add(new Employee("Hanuman",11.6,20));
		
		empList.add(new Employee("Laksham",9.5,19));
		empList.add(new Employee("Hanuman",11.6,20));
		
		empList.add(new Employee("Laksham",11.5,20));
		empList.add(new Employee("Hanuman",23.5,26));
		
		Set<Employee> uniqueEmpList = new TreeSet<Employee>(Employee.compareWithName);
		
		uniqueEmpList.addAll(empList);
		
		System.out.println("Set "+uniqueEmpList);
		System.out.println("List "+empList);
	}
}
