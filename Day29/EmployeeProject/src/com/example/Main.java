package com.example;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s1 = new Staff("Ram", LocalDate.of(2020, 10, 22),75000.00);
		Staff s2 = new Staff("Ram", LocalDate.of(2020, 10, 22),75000.00);
		Staff s3 = new Staff("Ram", LocalDate.of(2020, 10, 22),75000.00);
		Staff s4 = new Staff("Ram", LocalDate.of(2020, 10, 22),75000.00);
		
		StaffDao dao = new StaffDao();
		
		dao.insertStaff(s1);
		dao.insertStaff(s2);
		dao.insertStaff(s3);
		dao.insertStaff(s4);
		
		Staff s = dao.getById(2);
		System.out.println(s);
		List<Staff> list = dao.getAll();
		
		for(Staff staff : list) {
			System.out.println(staff);
		}
	}
}
