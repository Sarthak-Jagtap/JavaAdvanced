package com.example.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public class StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * private int id; private String name; private String email; private LocalDate
	 * dob; private String mobile; private double cgpa;
	 */

	public void insertData(Student student) {
		String query = "insert into Student(id,name,email,dob,mobile,cgpa) values(?,?,?,?,?,?)";

		jdbcTemplate.update(query, student.getId(), student.getName(), student.getEmail(), student.getDob(),
				student.getMobile(), student.getCgpa());
	}

	public List<Student> getAll() {
		String query = "select *  from Student";

		return (List<Student>) jdbcTemplate.query(
				query, 
				(rs, rowCount) -> {
					return new Student(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getString("email"),
								rs.getDate("dob").toLocalDate(),
								rs.getString("mobile"),
								rs.getDouble("cgpa")
							);
				}
			);
	}

}
