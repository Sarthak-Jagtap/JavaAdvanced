package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.example.model.Student;
import com.example.util.DBConnection;

public class StudentDao {

	public boolean addStudent(Student student) {

		boolean status = false;

		String sql = "INSERT INTO student(name, age, email) VALUES (?, ?, ?)";

		try (Connection con = new DBConnection().createDBConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, student.getName());
			ps.setInt(2, student.getAge());
			ps.setString(3, student.getEmail());

			int rows = ps.executeUpdate();

			if (rows > 0) {
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
}