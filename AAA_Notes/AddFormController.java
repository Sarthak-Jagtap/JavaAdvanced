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
 * Servlet implementation class AddFormController
 */
@WebServlet("/AddFormCont")
public class AddFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// form processing controller
		//1- retrieve form data
		String name = request.getParameter("name");
		String dt = request.getParameter("doj");
		String sal = request.getParameter("salary");
		String gender = request.getParameter("gender");
		//2- type cast(if any)
		LocalDate doj =LocalDate.parse(dt);
		float salary = Float.parseFloat(sal);
		List<String> errors = new ArrayList<String>();
		//3- perform validation
		if(name.length() == 0)
			errors.add("Name field can't left blank");
		if(doj.getYear() > 2026)
			errors.add("Specify a valid date");
		if(salary <25000)
			errors.add("Salary must be greater than 25000");
		if(gender.length() == 0)
			errors.add("select gender");
		
		//4- perform redirection
	if(!errors.isEmpty()) {
		request.setAttribute("errors", errors);
		RequestDispatcher rd = request.getRequestDispatcher("AddStaffForm");
		rd.forward(request, response);
		return;
	}	
		response.sendRedirect("success.html");
	}

}
