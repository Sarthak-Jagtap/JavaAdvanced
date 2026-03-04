package com.example;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StaffDao {

	PreparedStatement ps = null;
	ResultSet rs = null;

	int insertStaff(Staff s) {
		
		String query = "INSERT INTO Staff(name,dateOfJoining,salary) VALUES(?,?,?)";

		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setDate(2, Date.valueOf(s.getDoj()));
			ps.setDouble(3, s.getSalary());

			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}

	Staff getById(int id) {
		String query = "select * from Staff where id = ?";

		Staff staff = null;

		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				staff = new Staff(id, rs.getString("name"), rs.getDate("dateOfJoining").toLocalDate(),
						rs.getDouble("salary"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return staff;
	}
	
	List<Staff> getAll(){
		List<Staff> list = new ArrayList<>();
		
		String query = "select * from Staff";
		Staff staff = null;
		
		try {
			ps = new DBUtil().getCon().prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				staff = new Staff(
							rs.getInt("id"),
							rs.getString("name"),
							rs.getDate("dateOfJoining").toLocalDate(),
							rs.getDouble("salary")
						);
				
				list.add(staff);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
