package CapgM1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 2. HashMap with Custom Key (The "Contract") Scenario: You have
 * an Employee class with id and name. If you use Employee as a key in
 * a HashMap, what happens if you override equals() but not hashCode()?
 * 
 * • Key Concept: The hashCode-equals contract. If two objects are equal
 * according to equals(), they must return the same hashCode. Failing this leads
 * to "missing" data in collections.
 */

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }   

}   

public class HashMapCustomKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(1, "Alice");
		Employee e2 = new Employee(1, "Alice");

		map.put(e1, "Engineer");
		System.out.println(map.get(e2)); 
	}

}
