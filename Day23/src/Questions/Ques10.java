package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Employee Grouping
 * 
 * Given a list of Employee Class Group them by their city.
 * 
 * use : Collectors.groupingBy()
 */

class Employe {
	int id;
	String name;
	double salary;
	String city;

	public Employe(int id, String name, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
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


	public String getCity() {
		return city;
	}
	

}

public class Ques10 {
	public static void main(String[] args) {
		
		List<Employe> list = new ArrayList<>();
		
		Map<String,List<Employe>> group = list.stream().collect(Collectors.groupingBy(Employe::getCity));
		
		System.out.println(group);
	}
}
