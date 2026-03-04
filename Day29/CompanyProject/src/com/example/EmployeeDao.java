package com.example;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	PreparedStatement ps = null;
	ResultSet rs = null;

	/**
	 * Exercise 1
	 * 
	 * Create a Java program to:
	 * 
	 * Insert a new employee using PreparedStatement
	 * 
	 * Display success message
	 * 
	 * Handle SQL exceptions properly
	 * 
	 * create table Employee( empId INT PRIMARY KEY AUTO_INCREMENT, empName
	 * VARCHAR(50), empEmail VARCHAR(100), empSal DOUBLE, deptId INT, joiningDate
	 * DATE, foreign key (deptId) references Department(deptId) );
	 */

	public void insertEmp(Employee e) {
		String query = "insert into Employee (empName, empEmail, empSal, deptId, joiningDate) values (?,?,?,?,?)";

		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			ps.setString(1, e.getEmpName());
			ps.setString(2, e.getEmpEmail());
			ps.setDouble(3, e.getEmpSal());
			ps.setInt(4, e.getDeptId());
			ps.setDate(5, Date.valueOf(e.getJoiningDate()));

			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println(result + " Employee Record Added");
			}
		} catch (SQLException s) {
			System.out.println(s.getMessage());
			System.out.println("Try Again...");
		}
	}

	/**
	 * Exercise 2
	 * 
	 * Fetch all employees from database and display:
	 * 
	 * ID | Name | Salary | Department ID
	 * 
	 * @return
	 */

	public List<Employee> getAll() {
		String query = "select *  from Employee";
		List<Employee> list = new ArrayList<>();

		try {
			ps = new DBUtil().getCon().prepareStatement(query);

			rs = ps.executeQuery();

			Employee emp = new Employee(rs.getInt("empId"), rs.getString("empName"), rs.getString("empEmail"),
					rs.getDouble("empSal"), rs.getInt("deptId"), rs.getDate("joiningDate").toLocalDate());

			list.add(emp);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * Exercise 3
	 * 
	 * Update salary of employee by emp_id.
	 * 
	 * Condition:
	 * 
	 * Salary increase by 10% if department = IT.
	 * 
	 */

	public void updateEmpSal(int id) {
		String query = "update Employee set empSal = emplSal + empSal/10 where empId = ? and deptId in(select deptId from Depratment where deptName = ?)";

		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, "IT");
			int result = ps.executeUpdate();

			if (result > 0) {
				System.out.println(result + " Employee Record updated");
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	/**
	 * Exercise 4
	 * 
	 * Delete employee whose salary is less than 20,000.
	 */

	public void deleteEmps(double sal) {
		String query = "delete from Employee where empSal > ?";

		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			ps.setDouble(1, sal);

			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println(result + "Employee Record Data ");
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	/**
	 * Exercise 5 – Join Query
	 * 
	 * Display employee details with department name using INNER JOIN.
	 * 
	 * Expected Output:
	 * 
	 * Name | Salary | Department Name | Location
	 */

	public void empWithDept() {

	}

	/**
	 * Exercise 6 – Search Functionality
	 * 
	 * Create method:
	 * 
	 * searchEmployeeByName(String name)
	 * 
	 * 
	 * Use LIKE query with PreparedStatement.
	 */
	public Employee searchEmployeeByName(String name) {
		Employee emp = null;
		String query = "select * from Employee where empName like ?";

		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			ps.setString(0, name + "%");
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return emp;
	}

	/**
	 * Exercise 7 – Highest Paid Employee
	 * 
	 * Find employee with maximum salary.
	 */
	
	public Employee empWithMaxSal() {
		String query = "select * from Employee where empSal = (select max(empSal) from Employee)";
		Employee emp = null;
		try(PreparedStatement ps = new DBUtil().getCon().prepareStatement(query)){
			rs = ps.executeQuery();
			emp = new Employee(
						rs.getInt("empId"),
						rs.getString("empName"),
						rs.getString("empEmail"),
						rs.getDouble("empSal"),
						rs.getInt("deptId"),
						rs.getDate("joiningDate").toLocalDate()
					);
		}catch(SQLException s) {
			s.printStackTrace(); 
		}
		
		return emp;
	}
}
