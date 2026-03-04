package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = new DBUtil().getCon();
			con.setAutoCommit(false);
			
			String updateQuery = "update Staff set name = ?, salary = ? where id = ?";
			
			ps = con.prepareStatement(updateQuery);
			ps.setString(1, "Sitaa");
			ps.setDouble(2, 55000.4);
			ps.setInt(3, 2);
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println(result + " Update Succuss");
			}
			con.close();
			con.commit();
		}catch(SQLException s) {
			if(con != null) {
				try {
					System.out.println("Roll back");
					con.rollback();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
