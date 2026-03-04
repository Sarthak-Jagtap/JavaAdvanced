package Question;

import java.util.*;

// Create a Employee List and Sort based on Name, Salary and Age
public class Ques1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Ram",4.5,23));
		empList.add(new Employee("Sham",5.6,22));
		empList.add(new Employee("Sita",15.6,26));
		empList.add(new Employee("Laksham",9.5,19));
		empList.add(new Employee("Hanuman",11.6,20));
		
		
		System.out.println("Unsorted List" + empList);
		
		Collections.sort(empList,Employee.compareWithName);
		System.out.println("Sorted with name" + empList);

		Collections.sort(empList,Employee.compareWithSal);
		System.out.println("Sorted with Sal" + empList);

		Collections.sort(empList,Employee.compareWithAge);
		System.out.println("Sorted with Age" + empList);
		
	}
}
