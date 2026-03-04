package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.util.DBConnection;

public class ProductDao {
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<Product> getProducts(int offSet, int limit) {

	    List<Product> list = new ArrayList<>();
	    String query = "SELECT * FROM Product LIMIT ? OFFSET ?";

	    try (Connection con = new DBConnection().createDBConnection();
	         PreparedStatement ps = con.prepareStatement(query)) {

	        ps.setInt(1, limit);
	        ps.setInt(2, offSet);

	        try (ResultSet rs = ps.executeQuery()) {

	            while (rs.next()) {

	                Product product = new Product(
	                        rs.getInt("pId"),
	                        rs.getString("pName"),
	                        rs.getDouble("pPrice"),
	                        rs.getInt("pQuantity"),
	                        rs.getDate("pMFGDate").toLocalDate()
	                );

	                list.add(product);
	            }
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return list;
	}

	List<Product> getProductsAll() {
		List<Product> list = new ArrayList<>();

		String query = "select * from Product";
		Product product = null;

		try {
			ps = new DBConnection().createDBConnection().prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {

				product = new Product(
							rs.getInt("pId"), 
							rs.getString("pName"), 
							rs.getDouble("pPrice"),
							rs.getInt("pQuantity"), 
							rs.getDate("pMFGDate").toLocalDate()
						);

				list.add(product);
			}

		} catch (SQLException s) {
	        s.printStackTrace();
		}
		
		return list;
	}
}
