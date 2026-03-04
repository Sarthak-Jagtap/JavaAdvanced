package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class AddFormContoller
 */
@WebServlet("/AddFormContoller")
public class AddFormContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * form processing controller
	 * 
	 * 1. retrieve form data
	 * 
	 * 2. type cast(if any)
	 * 
	 * 3. perform validation
	 * 
	 * 4. perform redirection
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 1. retrieve form data
		String name = request.getParameter("name");
		String date = request.getParameter("doj");
		String sal = request.getParameter("salary");
		String gender = request.getParameter("gender");
		
		// 2. type cast(if any)
		LocalDate dateOfJoining = LocalDate.parse(date);
		Double salary = Double.parseDouble(sal);
		List<String> errors = new ArrayList<>();
		
		// 3. perform validation
		if(name.length() == 0) {
			errors.add("Name field is blank");
		}
		if(dateOfJoining.getYear() > 2026) {
			errors.add("Joining date invalid");
		}
		if(salary < 25000) {
			errors.add("Salary must be greater than 25000");
		}
		if(gender.length() == 0) {
			errors.add("Select gender");
		}
		
		// 4. perform redirection
		// RequestDispatcher - to redirect. 
		// 		- between the same
		
		if(!errors.isEmpty()) {
			request.setAttribute("errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("/AddStaffServlet");
			rd.forward(request, response);
			return;
		}
		
		response.sendRedirect("success.html");
	}

}
